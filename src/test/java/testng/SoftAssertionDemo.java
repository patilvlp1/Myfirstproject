package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo 
{	
	@Parameters("Demo")
	@Test
	public void softassert() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		
		WebElement signinHeading=driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		WebElement subheading=driver.findElement(By.xpath("//p[@class='header__content__subheading ']"));
		WebElement Logo=driver.findElement(By.xpath("//a[@aria-label='LinkedIn']"));
	
		String actualheading=signinHeading.getText();
		System.out.println("ActualHeadig=>"+actualheading);
		
		String actualsubheading=subheading.getText();
		System.out.println("subHeading=>"+actualsubheading);
		
		SoftAssert sa= new SoftAssert();
		//sa.assertEquals("Sign inn",actualheading);
		
		
		sa.assertFalse(false, actualsubheading);
		
		System.out.println("assert false method Expect true argument..");
		sa.assertAll();
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
