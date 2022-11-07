package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();
		
		String requiredDate="15";
		String requiredMont="December";
		String requiredYear="2023";
		
		String actualmonthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actualmonthyear);
		
		
		String [] str =actualmonthyear.split(" ");
		String actualmonth=str[0];
		String actualyear=str[1];
		
		while(!(actualmonth.equals(requiredMont) && actualyear.equals(requiredYear)))
		{
			driver.findElement(By.xpath("//span[.='Next']")).click();
			 actualmonthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(actualmonthyear);
			str =actualmonthyear.split(" ");
			 actualmonth=str[0];
			 actualyear=str[1];
			
		}
		driver.findElement(By.xpath("//a[.='"+requiredDate+"']")).click();
		
		
		
		
		
		driver.close();
		
		
	}
}
