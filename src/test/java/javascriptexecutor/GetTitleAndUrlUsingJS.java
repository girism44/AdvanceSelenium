package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndUrlUsingJS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
	js.executeScript("window.location=arguments[0];", "https://www.amazon.com/");
	System.out.println(driver.getTitle());
	driver.close();
		

	}

}
