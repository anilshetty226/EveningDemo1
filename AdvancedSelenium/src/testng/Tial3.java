package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tial3 
{
	@Test(enabled = true)
	public void test()
	{
		Reporter.log("Signup", true);
	}
	@Test(enabled = false)
	public void test1()
	{
		Reporter.log("Chat", true);
	}
	@Test()
	public void sample()
	{
		Reporter.log("Login", true);
	}
}
