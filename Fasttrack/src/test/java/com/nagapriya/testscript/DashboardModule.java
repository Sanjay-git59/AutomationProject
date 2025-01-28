package com.nagapriya.testscript;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasttrack.generic.BaseClass;
import com.nagapriya.pages.DashboardPage;
import com.nagapriya.pages.HomePage;

public class DashboardModule extends BaseClass{
	@Test
	public void createAndDeleteDashboard() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.setDashboard();
		String actualTitle=driver.getTitle();
		String expectedTitle = "Zoho CRM - Showing Dashboards";
		Assert.assertEquals(actualTitle, expectedTitle);
		DashboardPage d = new DashboardPage(driver);
		Thread.sleep(3000);
		d.setDashboardOpt();
		Thread.sleep(3000);
		d.setAddComponent();
		d.setComponentType();
		d.getComponentName().sendKeys("Laptop Dashboard");
		d.setSrcReport();
		d.setNextBtn();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		d.setChartType();
		driver.switchTo().defaultContent();
		d.setFinish();
		
	}
}
