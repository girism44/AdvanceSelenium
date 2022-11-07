package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {
	@Test
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test(enabled= false)
	public void demo2()
	{
		System.out.println("demo2");
	}
	@Test
	public void demo3()
	{
		System.out.println("demo3");
		Assert.fail();
	}
	@Test(dependsOnMethods ={"demo3","demo2"})
	public void demo4()
	{
		System.out.println("demo4");
	}

}
