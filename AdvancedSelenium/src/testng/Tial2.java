package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tial2 
{
	@Test(invocationCount = 5, priority = 0) 
	public void test()
	{
		Reporter.log("Signup", true);
	}
	@Test(priority = 2)
	public void test1()
	{
		Reporter.log("Chat", true);
	}
	@Test(invocationCount = 2, priority = 1)
	public void sample()
	{
		Reporter.log("Login", true);
	}
}
