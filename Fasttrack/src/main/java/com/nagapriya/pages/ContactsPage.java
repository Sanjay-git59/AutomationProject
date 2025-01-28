package com.nagapriya.pages;

import java.nio.file.WatchEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage {
@FindBy(xpath = "//input[@value='New Contact']")
private WebElement newContactBtn;

@FindBy(xpath = "//select[@name='property(saltName)']")
private  WebElement saltName;

@FindBy(xpath = "//input[@name='property(First Name)']")
private  WebElement firstNameTxtbox;

@FindBy(xpath = "//input[@name='property(Last Name)']")
private WebElement lastNameTxtBox;

@FindBy(xpath = "//input[@name='property(Account Name)']")
private WebElement accountNameTxtBox;

@FindBy(xpath = "//input[@name='property(Email)']")
private WebElement emailTxtBox;

@FindBy(xpath = "//input[@name='property(Date of Birth)']")
private WebElement dateOfBirthTxtBox;

@FindBy(xpath = "//input[@name='property(Mobile)']")
private WebElement mobileNumberTxtBox;

@FindBy(xpath = "//input[@name='property(Mailing Street)']")
private WebElement mailingStreetTxtBox;

@FindBy(xpath = "//input[@name='property(Mailing City)']")
private WebElement mailingCityTxtBox;

@FindBy(xpath = "//input[@name='property(Mailing State)']")
private WebElement mailingStateTxtBox;

@FindBy(xpath = "//input[@name='property(Mailing Zip)']")
private WebElement mailingZipTxtBox;

@FindBy(xpath = "//input[@name='property(Mailing Country)']")
private WebElement mailingCountryTxtBox;

@FindBy(xpath = "//input[@value='Save']")
private WebElement saveBtn;

@FindBy(id = "subvalue_Account Name")
private WebElement actaccountName;

@FindBy(xpath = "//input[@value='Delete']")
private WebElement deleteBtn;

public ContactsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}

public void setNewContact() {
	newContactBtn.click();
}

public void setSaltName() {
	Select s = new Select(saltName);
	s.selectByValue("Mrs.");
}

public WebElement getFirstNameTxtbox() {
	return firstNameTxtbox;
}

public WebElement getLastNameTxtBox() {
	return lastNameTxtBox;
}

public WebElement getAccountNameTxtBox() {
	return accountNameTxtBox;
}

public WebElement getEmailTxtBox() {
	return emailTxtBox;
}

public WebElement getDateOfBirthTxtBox() {
	return dateOfBirthTxtBox;
}

public WebElement getMobileNumberTxtBox() {
	return mobileNumberTxtBox;
}

public WebElement getMailingStreetTxtBox() {
	return mailingStreetTxtBox;
}

public WebElement getMailingCityTxtBox() {
	return mailingCityTxtBox;
}

public WebElement getMailingStateTxtBox() {
	return mailingStateTxtBox;
}

public WebElement getMailingZipTxtBox() {
	return mailingZipTxtBox;
}

public WebElement getMailingCountryTxtBox() {
	return mailingCountryTxtBox;
}
public void setSave() {
	saveBtn.click();
}

public WebElement getActualAccName() {
	return actaccountName;
}

public void setDelete() {
	deleteBtn.click();
}


}
