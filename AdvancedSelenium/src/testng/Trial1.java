package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trial1 
{
	@Test(priority = -3)
	public void test()
	{
		Reporter.log("Signup", true);
	}
	@Test
	public void test1()
	{
		Reporter.log("Chat", true);
	}
	@Test(priority = -2)
	public void sample()
	{
		Reporter.log("Login", true);
	}
}
