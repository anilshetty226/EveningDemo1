package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends Generic
{
	@Test
	public void test()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}
