package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrennshot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./photo/screenshot.png");
	FileUtils.copyDirectory(src, dest);

	
	driver.close();
}
}
