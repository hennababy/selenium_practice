package Day2Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	WebDriver driver;
	
	void InvokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hena\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	void Login()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("hennakiran0527@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bichuhenumiyu");
		driver.findElement(By.id("u_0_2")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.className("_1frb")).sendKeys("shaikh tanveer");
		driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		driver.findElement(By.cssSelector("a[href='https://www.facebook.com/shaikh.tanveer.507?ref=br_rs']")).click();
		driver.findElement(By.cssSelector("button[aria-label='Add Shaikh Tanveer as a friend']")).click();
		//driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.className("_54nc")).click();
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		facebook fb=new facebook();
		fb.InvokeBrowser();
		fb.Login();

	}

}
