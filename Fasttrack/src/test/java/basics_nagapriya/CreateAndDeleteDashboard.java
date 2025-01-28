package basics_nagapriya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAndDeleteDashboard {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.110.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Dashboards")).click();
		WebElement dashboardopt = driver.findElement(By.id("dashboards"));
		Select s = new Select(dashboardopt);
		s.selectByVisibleText("Campaign Dashboards");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Dashboard"));
		driver.findElement(By.xpath("//input[@value='Add Component']")).click();
		driver.findElement(By.xpath("//input[@value='chart']")).click();
		driver.findElement(By.id("header")).sendKeys("First Dashboard");
		WebElement srcReport = driver.findElement(By.xpath("//select[@name='srcReport']"));
		Select sr= new Select(srcReport);
		sr.selectByVisibleText("Leads by Ownership");
		driver.findElement(By.xpath("//Input[@value='Next']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(0);
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//td[text()='Pie']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@value='Finish']")).click();
		driver.quit();
		
	}

}
