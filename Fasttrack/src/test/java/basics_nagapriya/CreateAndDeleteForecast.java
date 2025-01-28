package basics_nagapriya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasttrack.generic.BaseClass;

public class CreateAndDeleteForecast {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.110.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Forecasts")).click();
		driver.findElement(By.xpath("//input[@value='New Forecast']")).click();
		WebElement year = driver.findElement(By.id("forecastYear"));
		WebElement quarter = driver.findElement(By.id("forecastQuarter"));
		Select s = new Select(year);
		s.selectByVisibleText("2010");
		Select q = new Select(quarter);
		q.selectByIndex(2);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("CRM"));
		driver.findElement(By.xpath("//input[@name='forecastQuota1']")).sendKeys("1257");
		driver.findElement(By.xpath("//input[@name='forecastQuota2']")).sendKeys("8476");
		driver.findElement(By.xpath("//input[@name='forecastQuota3']")).sendKeys("3457");
		driver.findElement(By.xpath("//input[@name='commitAmount1']")).sendKeys("4567");
		driver.findElement(By.xpath("//input[@name='commitAmount2']")).sendKeys("7057");
		driver.findElement(By.xpath("//input[@name='commitAmount3']")).sendKeys("3427");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		//driver.findElement(By.xpath("//input[@name='chk']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
	}

}
