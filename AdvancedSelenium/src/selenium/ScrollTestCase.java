package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollTestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.xpath("//a[.='About Us']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+x+","+x+")");
		ele.click();
	}
}
