package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecho.driver","./softwares/gechodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ANIL/Desktop/advanced%20selenium%20html/LeelaPalace.html");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel = new Select(ele);
		ArrayList<String> array = new ArrayList<String>();
		List<WebElement> option = sel.getOptions();
		int count=option.size();
		System.out.println(count);
		for (WebElement text : option)
		{
			String altext = text.getText();
			array.add(altext);
		}
		Collections.sort(array);
		for (String sorted : array)
		{
			System.out.println(sorted);
		}
	}

}
