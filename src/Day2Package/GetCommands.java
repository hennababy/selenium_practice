package Day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
WebDriver driver;
void InvokeBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hena\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
}

void commands()
{
	driver.get("http://www.google.com");
	String title;
	title=driver.getTitle();
	System.out.println("Title is "+title);
	String URL;
	URL=driver.getCurrentUrl();
	System.out.println("Current Url "+URL);
	//String pagesource;
	//pagesource = driver.getPageSource();
	//System.out.println("Page source is "+pagesource);
	//navigate();
	locators();
}

void navigate()
{
	driver.get("http:\\www.amazon.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("http:\\www.ebay.com");
	driver.navigate().refresh();
	driver.close();
	
}

void locators()
{
	driver.get("http:\\www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baseball");
	driver.findElement(By.className("nav-input")).click();
	driver.findElement(By.linkText("Jaeger Sports Exercise Baseball/Softball J-Bands")).click();
	//driver.findElement(By.partialLinkText("Your Amazon")).click();
	//driver.findElement(By.cssSelector("a#id=SSOFpopoverLink")).click();
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.id("hlb-ptc-btn-native")).click();
	driver.findElement(By.id("ap_email")).sendKeys("shaikht8@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("Impala148858");
	driver.findElement(By.id("signInSubmit")).click();
	driver.close();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GetCommands gc = new GetCommands();
gc.InvokeBrowser();
gc.commands();
	}

}
