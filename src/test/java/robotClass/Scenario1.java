package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
	
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement today = driver.findElement(By.xpath("//a[.=\"Today's Deals\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(today).perform();
		a.contextClick().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.quit();
		
		
	}

}
