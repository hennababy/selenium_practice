package Findlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findLinks {
	public static void main(String[] args) {
		 WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hena\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
	
 
		driver.get("http://toolsqa.wpengine.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		for (int i = 1; i<=links.size(); i=i+1)
 
		{
 
			System.out.println(links.get(i).getText());
			links.get(i).click();
			
 
		}
 
	}
}
