package basics_nagapriya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAndDeleteContacts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.110.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//input[@value='New Contact']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='property(saltName)']"));
		Select s = new Select(dropdown);
		s.selectByValue("Mrs.");
		driver.findElement(By.xpath("//input[@name='property(First Name)']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("Nagaraj");
		driver.findElement(By.xpath("//input[@name='property(Account Name)']")).sendKeys("Priya A Nagaraj");
		driver.findElement(By.xpath("//input[@name='property(Email)']")).sendKeys("priyanagraj2@gmail.com");
		driver.findElement(By.xpath("//input[@name='property(Date of Birth)']")).sendKeys("06/22/1994");
		driver.findElement(By.xpath("//input[@name='property(Mobile)']")).sendKeys("9988055694");
		driver.findElement(By.xpath("//input[@name='property(Mailing Street)']")).sendKeys("#3048 1st cross 2nd main");
		driver.findElement(By.xpath("//input[@name='property(Mailing City)']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@name='property(Mailing State)']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='property(Mailing Zip)']")).sendKeys("560085");
		driver.findElement(By.xpath("//input[@name='property(Mailing Country)']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Contact"));
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}

}
