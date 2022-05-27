package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[.='Users']")).click();
	} 
}
