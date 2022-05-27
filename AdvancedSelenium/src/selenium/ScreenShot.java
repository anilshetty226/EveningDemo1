package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\AmazonDefect.jpeg");
		FileUtils.copyFile(src, dst);		
	}
}
