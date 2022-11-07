package testNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG.ListenerImplementation.class)
public class FirstTest extends BaseclasssForRetry {
	
	@Test(retryAnalyzer=testNG.RetyrAnalyzer.class)
	public void firstTestCase()
	{
		System.out.println("In first case");
		driver.get("https://www.amazon.in/");
		Assert.fail();
		driver.close();
	}

}
