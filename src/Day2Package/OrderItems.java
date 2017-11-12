package Day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderItems {


	WebDriver driver;
	void InvokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hena\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	void Order()
	{
		driver.get("http:\\www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricketball");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText("SLAZENGER Ultimate Cricket Ball, Red")).click();
		Select qty=new Select(driver.findElement(By.id("quantity")));
		qty.selectByVisibleText("4");
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		driver.findElement(By.id("ap_email")).sendKeys("shaikht8@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Impala148858");
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OrderItems oi=new OrderItems();
oi.InvokeBrowser();
oi.Order();
	}

}
