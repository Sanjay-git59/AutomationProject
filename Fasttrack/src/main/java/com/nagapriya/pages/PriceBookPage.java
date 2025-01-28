package com.nagapriya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookPage {

	@FindBy(xpath = "//input[@value='New Price Book']")
	private WebElement newPriceBookBtn;
	
	@FindBy(xpath = "//input[@name='property(Price Book Name)']")
	private WebElement priceBookNameTxtBox;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@value='Add Products']")
	private WebElement addProductsBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[4]")
	private WebElement checkboxOpt1;
	
	@FindBy(xpath = "(//input[@name='chk'])[5]")
	private WebElement checkboxOpt2;
	
	@FindBy(xpath = "(//input[@name='listPrice1'])[4]")
	private WebElement listPrice1;
	
	@FindBy(xpath = "(//input[@name='listPrice1'])[5]")
	private WebElement listPrice2;

	@FindBy(xpath = "//input[@value='Add to Products']")
	private WebElement addToProductsBtn;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;
	
	public PriceBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNewPriceBook() {
		newPriceBookBtn.click();
	}

	public WebElement getPriceBookNameTxtBox() {
		return priceBookNameTxtBox;
	}

	public void setSave() {
		saveBtn.click();
	}
	
	public void setAddProduct() {
		addProductsBtn.click();
	}
	
	public void setChebox1() {
		checkboxOpt1.click();
	}
	
	public void setChebox2() {
		checkboxOpt2.click();
	}
	
	public WebElement getListPrice1() {
		return listPrice1;
	}

	public WebElement getListPrice2() {
		return listPrice2;
	}
	
	public void setAddToProducts() {
		addToProductsBtn.click();
	}
	
	public void setDelete() {
		deleteBtn.click();
	}
	
}
