package basics_nagapriya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAndDeleteProduct {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.110.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//input[@value='New Product']")).click();
		driver.findElement(By.xpath("//input[@name='property(Product Name)']")).sendKeys("Laptop");
		WebElement prodCategory = driver.findElement(By.xpath("//select[@name='property(Product Category)']"));
		Select s = new Select(prodCategory);
		s.selectByValue("Hardware");
		driver.findElement(By.xpath("//input[@name='property(Sales Start Date)']")).sendKeys("03/22/1998");
		driver.findElement(By.xpath("//input[@name='property(Sales End Date)']")).sendKeys("03/26/2025");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
