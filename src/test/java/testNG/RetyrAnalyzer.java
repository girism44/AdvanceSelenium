package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetyrAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int max = 3;
	public boolean retry(ITestResult result) {
		if(count<max) {
			count++;
		System.out.println(count);
		return true;
		}
		return false;
	}

}
