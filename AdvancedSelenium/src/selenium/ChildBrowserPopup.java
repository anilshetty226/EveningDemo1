package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/popup.php");
		String pid= driver.getWindowHandle();
		System.out.println(pid);
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Thread.sleep(2000);
		Set<String> alid = driver.getWindowHandles();
		for (String ids : alid) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
			if(url.equals("https://demo.guru99.com/articles_popup.php"))
			{
				driver.close();
			}
			System.out.println(ids);
		}

	}

}
