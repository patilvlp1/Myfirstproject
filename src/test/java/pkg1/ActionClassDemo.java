package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		Thread.sleep(1000);
		
	    WebElement name=driver.findElement(By.name("firstname"));
		Actions act= new Actions(driver);
		act.sendKeys(name,"vikas").sendKeys(Keys.TAB).sendKeys("patil").sendKeys(Keys.TAB).sendKeys("987654309")
		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.TAB)
		.sendKeys(Keys.ARROW_UP).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.TAB).sendKeys("gfgfd@gcg").build().perform();
		
	}

}
