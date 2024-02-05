package pkg1;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListOfWebElement {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();
	  
		/*
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys(
		 * "Admin");
		 *//*
		 * try {
		 * driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(
		 * "Admin"); //driver.findElement(By.
		 * xpath("//input[@class='oxd-input oxd-input--active' and @name='username']")).
		 * sendKeys("Admin");
		 * 
		 * }catch(NoSuchElementException e){
		 * System.out.println("Element is not Found"+e.getMessage()); }
		 */
	  driver.get("https://www.google.com/");
	  List<WebElement> links=driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
	  for(WebElement w:links)
	  {
		  System.out.println(w.getText());
	  }
	  
	  Thread.sleep(2000);
	  driver.quit();

	}

}
