package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		Actions act =new Actions(driver);
		
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		System.out.println("Swiched to frame::");
		
		WebElement slider= driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		act.clickAndHold(slider).moveByOffset(250, 0).release().build().perform();
		
		Thread.sleep(2000);

		driver.switchTo().parentFrame();
	}

}
