package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	WebDriver driver;
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	System.out.println("OnFinish");	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("OnStart");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {

		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./photo/amazon.png");
		
		try {
			 FileUtils.copyFile(src, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnSkip");
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestStart");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestSuccess");
	
	}

}
