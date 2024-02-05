package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	static WebDriver driver; 
	@Parameters("browsername")
	@Test
	public void login(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/");
		}
		Thread.sleep(1000);	
	
	}
	@Parameters("browsername")
	@Test
	public void login2(String browser2) throws InterruptedException
	{
		if(browser2.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			Thread.sleep(1000);	
			driver.close();
		}
		Thread.sleep(1000);	
		
	}
	
	

}
