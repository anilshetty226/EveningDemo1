package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesTestCase1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame2");
		WebElement ele = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		String text = ele.getText();
		System.out.println(text);
		driver.close();
	}
}
