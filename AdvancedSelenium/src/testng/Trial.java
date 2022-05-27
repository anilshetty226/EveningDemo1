package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trial 
{
	@Test
	public void test()
	{
		Reporter.log("1", true);
	}
	@Test
	public void test1()
	{
		Reporter.log("2", true);
	}
	@Test
	public void sample()
	{
		Reporter.log("3", true);
	}
}
