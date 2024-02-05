package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		String txalert=driver.switchTo().alert().getText(); 
		System.out.println("Alert Text is:-"+txalert);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement dis=driver.findElement(By.id("confirmButton"));
		dis.click();
		String disalert= driver.switchTo().alert().getText();
		System.out.println("Confirm box alert Text is:->"+disalert);
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		
		//enter text
		WebElement prompt=driver.findElement(By.id("promtButton"));
		prompt.click();
		String promptxt= driver.switchTo().alert().getText();
		//sendKeys("Vikas Patil");
		System.out.println("***&&&&&&&&&*******");
		System.out.println("Prompt button text is:-"+promptxt);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Vikas");
		
		driver.switchTo().alert().accept();
		driver.close();
		
		
	}

}
