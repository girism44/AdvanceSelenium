package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.news18.com/pro-kabaddi/points-table/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> team = driver.findElements(By.xpath("//table[@class='jsx-692773571 point-table']/tr"));
		//for(int i=2;i<=team.size();i++)
		{
		 String win = driver.findElement(By.xpath("//table[@class='jsx-692773571 point-table']/tr[last()]/td[3]")).getText();
		 //if(win.equals("1"))
		 {
			 String teamname=driver.findElement(By.xpath("//table[@class='jsx-692773571 point-table']/tr[last()]/td[1]")).getText();
			 
			 String point =driver.findElement(By.xpath("//table[@class='jsx-692773571 point-table']/tr[last()]/td[6]")).getText();
			 
			 System.out.println(win+" "+teamname+" "+point);
			 
		 }
		}
		driver.close();

	}

}
