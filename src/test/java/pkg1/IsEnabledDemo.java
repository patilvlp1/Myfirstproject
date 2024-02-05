package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		Thread.sleep(2000);

		WebElement btn=driver.findElement(By.id("disable"));
		
		boolean btnenabled=btn.isEnabled();
		
		System.out.println("Before operation:-"+btnenabled);
		Thread.sleep(1000);
		
		WebElement btn1=driver.findElement(By.id("enable-button"));
		btn1.click();
		
		Thread.sleep(10000);
		 boolean afterisEnabled= btn1.isEnabled();
		 
		 System.out.println("After Opeation:-"+afterisEnabled);
		
		 driver.close();
		 
	}

}
