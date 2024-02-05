package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverActionAndDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement hovr=driver.findElement(By.id("sub-menu"));
		
		Actions act= new Actions(driver);
		//act.moveToElement(hovr).perform();
		Thread.sleep(2000);
		
//		List<WebElement> cherech= driver.findElements(By.id("link1"));
//		act.moveToElement(cherech).perform();
		
		WebElement dblclick=driver.findElement(By.xpath("//*[@id='double-click']"));
		
		act.moveToElement(dblclick).perform();
		//String txtonpopup=driver.switchTo().alert().getText();
		//System.out.println(txtonpopup);
		//driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//act.moveToElement(dblclick).doubleClick().build().perform();
		
		
	}

}
