package com.nagapriya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {
@FindBy(id="dashboards")
private WebElement dashboardOpt;

@FindBy(xpath="//input[@value='Add Component']")
private WebElement addComponentBtn;

@FindBy(xpath = "//input[@value='chart']")
private WebElement componentType;

@FindBy(id="header")
private WebElement componentName;

@FindBy(xpath = "//select[@name='srcReport']")
private WebElement srcReport;

@FindBy(xpath = "//Input[@value='Next']")
private WebElement nextBtn;

@FindBy(xpath = "//td[text()='Pie']")
private WebElement chartType;

@FindBy(xpath = "//input[@value='Finish']")
private WebElement finishBtn;

public DashboardPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setDashboardOpt() {
	Select s = new Select(dashboardOpt);
	s.selectByVisibleText("Campaign Dashboards");
}
public void setAddComponent() {
	addComponentBtn.click();
}

public void setComponentType() {
	componentType.click();
}

public WebElement getComponentName() {
	return componentName;
}

public void setSrcReport() {
	Select s = new Select(srcReport);
	s.selectByVisibleText("Leads by Ownership");
}

public void setNextBtn() {
	nextBtn.click();
}
public void setChartType() {
	chartType.click();
}
public void setFinish() {
	finishBtn.click();
}
}
