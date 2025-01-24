package com.fasttrack.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fasttrack.pages.HomePage;
import com.fasttrack.pages.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public FileLib f = new FileLib();

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getPropertyData("url");
		driver.get(url);
	}

	@BeforeMethod
	public void login() throws IOException {
		LoginPage l = new LoginPage(driver);
		String un = f.getPropertyData("un");
		l.login(un, f.getPropertyData("pwd"));
	}

	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.setLogout();
	}

	@AfterTest
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
