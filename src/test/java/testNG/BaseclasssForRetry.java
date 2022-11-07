package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclasssForRetry {
	protected WebDriver driver;
	@BeforeClass
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
	}
	
	

}
