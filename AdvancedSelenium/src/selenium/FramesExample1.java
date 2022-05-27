package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//li[.='iFrame']")).click();
		WebElement frameaddress = driver.findElement(By.xpath("//iFrame[@class=' lazyloaded']"));
		driver.switchTo().frame(frameaddress);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Advanced Selenium");
		//switching to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='s']")).clear();
	}
}
