package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRegTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		//Thread.sleep(2000);
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("//*[@id=\\'userName\\']"));
				ele.sendKeys("Vikas_patil");
		System.out.println(ele.getAttribute("value"));
				
				
		////*[@id="userName"]
		//input[@type='email']
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abdgdvyh123@gmail.com");
		 
		 driver.findElement(By.id("currentAddress")).sendKeys("At. post satod, tal-yawal,Dist:-Jalgaon");
		 
		 driver.findElement(By.id("permanentAddress")).sendKeys("At. post satod, tal-yawal,Dist:-Jalgaon");
		 driver.findElement(By.id("submit")).click();
		
		 System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		

	}

}
