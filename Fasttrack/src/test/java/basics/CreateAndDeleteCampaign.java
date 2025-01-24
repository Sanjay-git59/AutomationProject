package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteCampaign {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.203.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	driver.findElement(By.linkText("Campaigns")).click();
//	driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
//	driver.findElement(By.name("property(Campaign Name)")).sendKeys("Samsung 25 Ultra");
//	driver.findElement(By.name("property(Start Date)")).sendKeys("12/28/2024");
//	WebElement typeDD = driver.findElement(By.name("property(Type)"));
//	Select s1=new Select(typeDD);
//	s1.selectByIndex(3);
//	WebElement statusDD = driver.findElement(By.name("property(Status)"));
//	Select s2=new Select(statusDD);
//	s2.selectByIndex(3);
//	driver.findElement(By.name("property(End Date)")).sendKeys("01/02/2025");
//	driver.findElement(By.xpath("//input[@value='Save']")).click();
//	driver.findElement(By.xpath("//input[@value='Delete']")).click();
//	driver.switchTo().alert().accept();
	
}
}
