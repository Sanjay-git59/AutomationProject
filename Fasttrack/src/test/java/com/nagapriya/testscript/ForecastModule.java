package com.nagapriya.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasttrack.generic.BaseClass;
import com.fasttrack.generic.FileLib;
import com.nagapriya.pages.ForecastPage;
import com.nagapriya.pages.HomePage;


public class ForecastModule extends BaseClass {
	@Test
	public void createAndDeleteForecast() throws EncryptedDocumentException, IOException{
		HomePage h = new HomePage(driver);
		h.setForecasts();
		String actualTitle=driver.getTitle();
		String expectedTitle = "Zoho CRM - Displaying Custom View Details";
		Assert.assertEquals(actualTitle, expectedTitle);
		ForecastPage fp = new ForecastPage(driver);
		fp.setNewForecast();
		fp.setForecastYear();
		fp.setForecastQuarter();
		fp.setNextBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String forecastQuota1 = f.getExcelData("priForecast", 1, 0);
		String forecastQuota2 = f.getExcelData("priForecast", 1, 1);
		String forecastQuota3 = f.getExcelData("priForecast", 1, 2);
		fp.getForecastquotxtbox1().sendKeys(forecastQuota1);
		fp.getForecastquotxtbox1().sendKeys(forecastQuota2);
		fp.getForecastquotxtbox1().sendKeys(forecastQuota3);
		String commitAmount1 = f.getExcelData("priForecast", 1, 3);
		String commitAmount2 = f.getExcelData("priForecast", 1, 4);
		String commitAmount3 = f.getExcelData("priForecast", 1, 5);
		fp.getCommitAmount1().sendKeys(commitAmount1);
		fp.getCommitAmount2().sendKeys(commitAmount2);
		fp.getCommitAmount3().sendKeys(commitAmount3);
		fp.setSaveBtn();
		fp.setdeleteBtn();
		driver.switchTo().alert().accept();
	}
}