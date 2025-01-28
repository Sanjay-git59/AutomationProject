package com.nagapriya.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasttrack.generic.BaseClass;
import com.nagapriya.pages.HomePage;
import com.nagapriya.pages.Productpage;


public class ProductModule extends BaseClass {
	@Test
public void createAndDeleteProducts() throws EncryptedDocumentException, IOException {
	HomePage h = new HomePage(driver);
	h.setProducts();
	String actualTitle=driver.getTitle();
	String expectedTitle = "Zoho CRM - Displaying Custom View Details";
	Assert.assertEquals(actualTitle, expectedTitle);
	Productpage p = new Productpage(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	p.setNewProduct();
	String productName = f.getExcelData("priProducts", 1, 0);
	p.getProductNameTxtbox().sendKeys(productName);
	p.setProdCategory();
	String salesStartDate = f.getExcelData("priProducts", 1, 1);
	p.getSalesStartDate().sendKeys(salesStartDate);
	String salesEndDate = f.getExcelData("priProducts", 1, 2);
	p.getSalesEndDate().sendKeys(salesEndDate);
	p.setSave();
	p.setDelete();
	driver.switchTo().alert().accept();
}
}
