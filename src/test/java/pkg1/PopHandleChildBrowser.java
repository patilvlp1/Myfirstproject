package pkg1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandleChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("//div[@class='btn96DefaultClass absolute-center cur-po bodyBaseHeavy contentPrimary cur-po btn96MediumButton btn96ButtonLabel contentOnColour backgroundAccent btn96ButtonHover']")).click();
		
		Thread.sleep(2000);
		
		WebElement closebtn=driver.findElement(By.xpath("//span[@class='rodal-close']"));
		
		boolean b= closebtn.isDisplayed();
		System.out.println("Before clicking:->"+b);
		closebtn.click();
		Thread.sleep(1000);
		
		boolean ab= closebtn.isDisplayed();
		System.out.println("After clicking:->"+b);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
