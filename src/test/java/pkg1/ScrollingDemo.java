package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		//WebElement scrol=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		
		//scroll By Pixel
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(0,-400)");
		//Thread.sleep(2000);
		//Toggle Button Handle Using JavaScriptExecutor
		WebElement togglee=driver.findElement(By.xpath("//*[@href='https://jqueryui.com/toggle/']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();",togglee);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", togglee);
		
		WebElement ifame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));

		driver.switchTo().frame(ifame);
		System.out.println("switched to frame");

		WebElement runeff= driver.findElement(By.xpath("//button[@class='ui-state-default ui-corner-all']"));
	
		WebElement disp=driver.findElement(By.xpath("//*[@class='ui-widget-content ui-corner-all']"));
		System.out.println("Before click is Dispalyed :-"+disp.getText());
		runeff.click();
		System.out.println("after click is Dispalyed :-"+disp.isDisplayed());
		Thread.sleep(2000);
		
	
		driver.close();
		
		
		
		

	}

}
