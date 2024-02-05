package testnglistner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerPr1 {
       static WebDriver driver;
		@Test
		public static void LoginOrangeDemo() throws InterruptedException {
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
			
			//Verify The Error Message
			//WebElement errormsg=driver.findElement(By.xpath("//div/p[text()='Invalid credentials']"));
			
			/*String msg=errormsg.getText();
			System.out.println("Error Message.>"+msg);
			System.out.println("Text Is->"+msg);
			Assert.assertEquals(msg,"Invalid credentials");*/
			Thread.sleep(2000);
			
		}
		@Test (dependsOnMethods="LoginOrangeDemo")
		public void Logout() {
			Assert.fail();
			System.out.println("Logout method is running-..");	
		}

			

}

