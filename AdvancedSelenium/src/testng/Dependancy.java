package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependancy 
{
	@Test
	public void test()
	{
		Reporter.log("Signup", true);
	}
	@Test(dependsOnMethods = "sample")
	public void test1()
	{
		Reporter.log("Chat", true);
	}
	@Test(dependsOnMethods = "test")
	public void sample()
	{
		Reporter.log("Login", true);
	}
}
