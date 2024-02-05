package pkgdepend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AlertDemoPractice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions option= new ChromeOptions();
		  option.addArguments("start-maximized"); 
		driver= new  ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		  /*ChromeDriver driver= new ChromeDriver(option);
		 */
		
		WebElement alert1=driver.findElement(By.xpath("//input[@name='alert']"));
		alert1.click();
		Thread.sleep(2000);
		String txt=driver.switchTo().alert().getText();
		System.out.println("alert text:"+txt);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		//double click
		WebElement dblclick=driver.findElement(By.xpath("//input[@id='double-click']"));
		Thread.sleep(1000);
		act.doubleClick(dblclick).perform();
		String dbl=driver.switchTo().alert().getText();
		System.out.println("DoubleTxt:-"+dbl);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//right click action
		act.moveToElement(dblclick).contextClick().build().perform();
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
