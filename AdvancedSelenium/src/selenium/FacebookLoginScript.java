package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Anil");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("shetty@1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
