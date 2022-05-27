package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver cd= new ChromeDriver();

	}

}
