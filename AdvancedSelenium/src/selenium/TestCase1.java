package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ANIL/Desktop/AdvancedSeleniumHtml/TestCase1.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("c3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).click();
	}

}
