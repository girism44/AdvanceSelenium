package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alltimebating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/all-time-batting']")).click();
		List<WebElement> all = driver.findElements(By.xpath("//table/tbody/tr"));
		for(int i=2;i<=all.size();i++)
		{
			String countryname =driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/descendant::span[@class='table-body__logo-text']")).getText();
			if(countryname.equals("IND"))
			{
				String playername=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			    System.out.println(countryname +" "+ playername);
			}
			
		}
		
		
		driver.quit();
		
		

	}

}
