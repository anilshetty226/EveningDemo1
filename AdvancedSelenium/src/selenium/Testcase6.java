package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase6 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> array = new ArrayList<String>(ids);
		String child = array.get(1);
		driver.switchTo().window(child);
	}

}
