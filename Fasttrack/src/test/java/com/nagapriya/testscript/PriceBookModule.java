package com.nagapriya.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasttrack.generic.BaseClass;
import com.nagapriya.pages.HomePage;
import com.nagapriya.pages.PriceBookPage;

public class PriceBookModule extends BaseClass {
	@Test
	public void createAndDeletePriceBook() {
		HomePage h = new HomePage(driver);
		h.setPriceBook();
		String actualTitle=driver.getTitle();
		String expectedTitle = "Zoho CRM - Displaying Custom View Details";
		Assert.assertEquals(actualTitle, expectedTitle);
		PriceBookPage p = new PriceBookPage(driver);
		p.setNewPriceBook();
		p.getPriceBookNameTxtBox().sendKeys("Laptop");
		p.setSave();
		p.setAddProduct();
		p.setChebox1();
		p.setChebox2();
		p.getListPrice1().sendKeys("45678");
		p.getListPrice2().sendKeys("234");
		p.setAddToProducts();
		p.setDelete();
		driver.switchTo().alert().accept();
	}
}
