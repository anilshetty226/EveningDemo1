package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ANIL/Desktop/AdvancedSeleniumHtml/Sample2.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).click();
	}
}