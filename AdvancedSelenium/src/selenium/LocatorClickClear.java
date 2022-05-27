package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorClickClear {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ANIL/Desktop/New%20folder%20(2)/locator1.html");
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("c2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("c3")).clear();
		

	}

}
