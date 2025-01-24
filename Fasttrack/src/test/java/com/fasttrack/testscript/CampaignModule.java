package com.fasttrack.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fasttrack.generic.BaseClass;
import com.fasttrack.pages.HomePage;
@Listeners(com.fasttrack.generic.ListenerImplementation.class)
public class CampaignModule extends BaseClass{
	@Test
public void createAndDeleteCampaign() throws EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		h.setCampaign();
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		String campaignName = f.getExcelData("createcampaign", 1, 0);
		String startDate = f.getExcelData("createcampaign", 1, 1);
		String endDate = f.getExcelData("createcampaign", 1, 2);
		driver.findElement(By.name("property(Campaign Name)")).sendKeys(campaignName);
		driver.findElement(By.name("property(Start Date)")).sendKeys(startDate);
		WebElement typeDD = driver.findElement(By.name("property(Type)"));
		Select s1=new Select(typeDD);
		s1.selectByIndex(3);
		WebElement statusDD = driver.findElement(By.name("property(Status)"));
		Select s2=new Select(statusDD);
		s2.selectByIndex(3);
		driver.findElement(By.name("property(End Date)")).sendKeys(endDate);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		//Assertion
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();

}
}
