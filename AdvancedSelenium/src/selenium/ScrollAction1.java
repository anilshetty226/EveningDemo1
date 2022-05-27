package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollAction1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		}
		for(int j=0;j<3;j++)
		{
		jse.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		}
	}
}
