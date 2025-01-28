package com.nagapriya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForecastPage {
	@FindBy(xpath = "//input[@value='New Forecast']")
	private WebElement newForecastBtn;

	@FindBy(id = "forecastYear")
	private WebElement forecastyeardrpdwn;

	@FindBy(id = "forecastQuarter")
	private WebElement forecastQuarterdrpdwn;

	@FindBy(xpath = "//input[@value='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//input[@name='forecastQuota1']")
	private WebElement forecastquotxtbox1;
	
	@FindBy(xpath = "//input[@name='forecastQuota2']")
	private WebElement forecastquotxtbox2;
	
	@FindBy(xpath = "//input[@name='forecastQuota3']")
	private WebElement forecastquotxtbox3;
	
	@FindBy(xpath = "//input[@name='commitAmount1']")
	private WebElement commitAmount1;
	
	@FindBy(xpath = "//input[@name='commitAmount2']")
	private WebElement commitAmount2;
	
	@FindBy(xpath = "//input[@name='commitAmount3']")
	private WebElement commitAmount3;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteBtn;

	public  ForecastPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setNewForecast()
	{
		newForecastBtn.click();
	}
	public void setForecastYear()
	{
		Select s =new Select(forecastyeardrpdwn);
		s.selectByValue("2010");
	}
	public void setForecastQuarter()
	{
		Select s =new Select(forecastQuarterdrpdwn);
		s.selectByIndex(2);
	}
	public void setNextBtn()
	{
		nextBtn.click();
	}

	public WebElement getCommitAmount1() {
		return commitAmount1;
	}

	public WebElement getCommitAmount2() {
		return commitAmount2;
	}

	public WebElement getForecastquotxtbox1() {
		return forecastquotxtbox1;
	}

	public WebElement getForecastquotxtbox2() {
		return forecastquotxtbox2;
	}

	public WebElement getForecastquotxtbox3() {
		return forecastquotxtbox3;
	}

	public WebElement getCommitAmount3() {
		return commitAmount3;
	}
	
	public void setSaveBtn() {
		saveBtn.click();
	}
	
	public void setdeleteBtn() {
		deleteBtn.click();
	}
	
}
