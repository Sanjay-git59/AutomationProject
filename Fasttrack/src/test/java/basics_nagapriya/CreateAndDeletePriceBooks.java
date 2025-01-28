package basics_nagapriya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeletePriceBooks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.110.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Price Books")).click();
		driver.findElement(By.xpath("//input[@value='New Price Book']")).click();
		driver.findElement(By.xpath("//input[@name='property(Price Book Name)']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@value='Add Products']")).click();
		driver.findElement(By.xpath("(//input[@name='chk'])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='chk'])[5]")).click();
		driver.findElement(By.xpath("(//input[@name='listPrice1'])[4]")).sendKeys("8662");
		driver.findElement(By.xpath("(//input[@name='listPrice1'])[5]")).sendKeys("62662");
		driver.findElement(By.xpath("//input[@value='Add to Products']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
