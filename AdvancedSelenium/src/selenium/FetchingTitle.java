package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
