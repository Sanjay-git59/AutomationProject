package com.nagapriya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Forecasts")
private WebElement forecastlink;

@FindBy(linkText = "Price Books")
private WebElement pricebooklink;

@FindBy(linkText = "Products")
private WebElement productslink;

@FindBy(linkText = "Contacts")
private WebElement contactslink;

@FindBy(linkText = "Dashboards")
private WebElement dashboardlink;

@FindBy(partialLinkText  = "Logout")
private WebElement logoutLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setForecasts() {
	forecastlink.click();
}

public void setPriceBook() {
	pricebooklink.click();
}

public void setContacts() {
	contactslink.click();
}

public void setProducts() {
	productslink.click();
}

public void setDashboard() {
	dashboardlink.click();
}
public void setLogout() {
	logoutLink.click();
}
}
