package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-300)");
	}
}
