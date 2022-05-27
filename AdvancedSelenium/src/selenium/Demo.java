package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";		
		System.setProperty(key, value);// TODO Auto-generated method stub
		FirefoxDriver ffd=new FirefoxDriver();

	}

}
