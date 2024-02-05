package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		//click on ok button
		Thread.sleep(2000);
		
		String TxtOnAlert= driver.switchTo().alert().getText();
		System.out.println("Text On popUp Window:"+TxtOnAlert);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//dismiss
		driver.findElement(By.name("confirmation")).click();
		
		Thread.sleep(1000);
		String TxtConfirm=driver.switchTo().alert().getText();
		System.out.println("Text On Confirmation btn:"+TxtConfirm);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
		//File upload
		driver.findElement(By.xpath("//input[@name='upload']")).sendKeys("C:\\Users\\hp\\Desktop\\General\\browserTest.txt");
		
		//driver.close();
		
		
		
		

	}

}
