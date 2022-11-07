package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	@Test
	public void action() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//div[@class='fsw widgetOpen']/descendant::input[@id='fromCity']")).sendKeys("BOM");
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("GOA");
		//driver.findElement(By.xpath("//p[.='Goa, India']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Search']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("new delhi");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}

}
