package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrmlogin {
	static WebDriver driver;
	@Test(priority=0)
	public static void login() throws InterruptedException {
		 driver= new ChromeDriver();
		//driver.get("https://www.linkedin.com/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Thread.sleep(2000);
		WebElement loginHeading=driver.findElement(By.xpath("//h5[text()='Login']"));
		
		//Verify Login Heading
		String actualheadhing=loginHeading.getText();
		System.out.println("Login Heading text=>"+actualheadhing);
		Thread.sleep(2000);
		//Assert.assertEquals(actualheadhing, "Login");
		
		
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys("Admin");
		//uname.sendKeys(ExcelDataDemo.Readdata(1, 0));
	    
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys("admin123");	
		
		//Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(3000);
	}

}
