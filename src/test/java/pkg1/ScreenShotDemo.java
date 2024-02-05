package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utilitypkg.TakeScreenShotDemo;

public class ScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
				WebDriver driver = new ChromeDriver();
			
				driver.manage().window().maximize();

				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name=\"alert\"]")).click();
				
				driver.switchTo().alert().accept();
				//TakesScreenshot scrshot=(TakesScreenshot)driver;
				
				//File src = scrshot.getScreenshotAs(OutputType.FILE);
				//File dest=new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumFramework\\screenst\\ss1.png");
				//FileHandler.copy(src, dest);
				
				//FileUtils
				//Call SC Methos from utility pkg
				TakeScreenShotDemo.captureScreenShot(driver, "SC22");
				
				
				driver.quit();
		

	}

}
