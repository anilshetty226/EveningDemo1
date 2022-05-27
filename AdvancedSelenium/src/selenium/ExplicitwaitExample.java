package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("enter"));
		String title = driver.getTitle();
		System.out.println(title);
	}
}
