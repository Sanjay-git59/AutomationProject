package com.nagapriya.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasttrack.generic.BaseClass;
import com.nagapriya.pages.ContactsPage;
import com.nagapriya.pages.HomePage;

public class ContactsModule extends BaseClass {
	@Test
	public void CreateAndDeleteContact() throws EncryptedDocumentException, IOException {
	HomePage h = new HomePage(driver);
	h.setContacts();
	String actualTitle=driver.getTitle();
	String expectedTitle = "Zoho CRM - Displaying Custom View Details";
	Assert.assertEquals(actualTitle, expectedTitle);
	ContactsPage c = new ContactsPage(driver);
	c.setNewContact();
	c.setSaltName();
	String firstname = f.getExcelData("PriContacts", 1, 0);
	String lastname = f.getExcelData("PriContacts", 1, 1);
	String accountname = f.getExcelData("PriContacts", 1, 2);
	String email = f.getExcelData("PriContacts", 1, 3);
	String dob = f.getExcelData("PriContacts", 1, 4);
	String mobile = f.getExcelData("PriContacts", 1, 5);
	String mailingstreet = f.getExcelData("PriContacts", 1, 6);
	String mailingcity = f.getExcelData("PriContacts", 1, 7);
	String mailingstate = f.getExcelData("PriContacts", 1, 8);
	String mailingzip = f.getExcelData("PriContacts", 1, 9);
	String mailingcountry = f.getExcelData("PriContacts", 1, 10);
	c.getFirstNameTxtbox().sendKeys(firstname);
	c.getLastNameTxtBox().sendKeys(lastname);
	c.getAccountNameTxtBox().sendKeys(accountname);
	c.getEmailTxtBox().sendKeys(email);
	c.getDateOfBirthTxtBox().sendKeys(dob);
	c.getMobileNumberTxtBox().sendKeys(mobile);
	c.getMailingStreetTxtBox().sendKeys(mailingstreet);
	c.getMailingCityTxtBox().sendKeys(mailingcity);
	c.getMailingStateTxtBox().sendKeys(mailingstate);
	c.getMailingZipTxtBox().sendKeys(mailingzip);
	c.getMailingCountryTxtBox().sendKeys(mailingcountry);
	c.setSave();
	String actualaccountname = c.getActualAccName().getText();
	SoftAssert s = new SoftAssert();
			s.assertEquals(accountname,actualaccountname );
	c.setDelete();
	driver.switchTo().alert().accept();
	s.assertAll();
}
}
