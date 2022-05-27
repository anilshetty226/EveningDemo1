package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptClear {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/ANIL/Desktop/AdvancedSeleniumHtml/disabled.html");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('t1').value=' '");
	}
}