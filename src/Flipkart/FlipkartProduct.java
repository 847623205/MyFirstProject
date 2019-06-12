package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartProduct 
{
	
WebDriver driver;
	
	@BeforeTest
	public void Configuration()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Backup\\Eclipse\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		
	}
	
	
	@Test
	public void ExcelWrite()
	{
		System.out.println("Hi");
		System.out.println("Hello Welcome");
	}
	
	
	@AfterTest
	public void ExitPoint()
	{
		
	}

}
