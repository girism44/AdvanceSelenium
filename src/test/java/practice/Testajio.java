package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testajio {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	@Test
	public void action()
	{
		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}
}

//item=//div[@class='products']/descendant::div[39]/child::a/descendant::div[@class='nameCls']
//price=//div[@class='products']/descendant::div[39]/child::a/descendant::span[@class='price  ']
