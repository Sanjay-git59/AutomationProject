package com.fasttrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Campaigns")
private WebElement campaignLink;
@FindBy(partialLinkText  = "Logout")
private WebElement logoutLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setCampaign() {
	campaignLink.click();
}
public void setLogout() {
	logoutLink.click();
}
}
