package com.nagapriya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productpage {
	
	@FindBy(xpath = "//input[@value='New Product']")
	private WebElement newProductBtn;
	
	@FindBy(xpath = "//input[@name='property(Product Name)']")
	private WebElement productNameTxtbox;
	
	@FindBy(xpath = "//select[@name='property(Product Category)']")
	private WebElement prodCategorydropdwn;
	
	@FindBy(xpath = "//input[@name='property(Sales Start Date)']")
	private WebElement salesStartDatetxtbox;
	
	@FindBy(xpath = "//input[@name='property(Sales End Date)']")
	private WebElement salesEndDate;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNewProduct() {
		newProductBtn.click();
	}

	public WebElement getProductNameTxtbox() {
		return productNameTxtbox;
	}

	public void setProdCategory() {
		Select s = new Select(prodCategorydropdwn);
		s.selectByIndex(1);
	}
	public WebElement getSalesStartDate() {
		return salesStartDatetxtbox;
	}
	public WebElement getSalesEndDate() {
		return salesEndDate;
	}
	public void setSave() {
		saveBtn.click();
	}
	public void setDelete() {
		deleteBtn.click();
	}
	
	}
	