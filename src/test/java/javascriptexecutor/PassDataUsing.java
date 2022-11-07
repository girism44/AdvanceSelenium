package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassDataUsing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement glass=driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];",glass,"laptop");
		Thread.sleep(3000);
		driver.close();

	}

}
