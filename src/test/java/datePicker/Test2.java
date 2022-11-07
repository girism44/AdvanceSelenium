package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("banglore");
		driver.findElement(By.id("dest")).sendKeys("goa");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		String actualmonthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		//System.out.println(actualmonthyear);
		String expecteddate="10",expectedmonthyear="december 2022";
		while(!(actualmonthyear.equalsIgnoreCase(expectedmonthyear)))
		{
			driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[3]")).click();
			actualmonthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(actualmonthyear);
		}
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[.='"+expecteddate+"']")).click();
		driver.findElement(By.id("search_btn")).click();
		driver.close();
		
		
	}

}
