package pkg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		////button[@aria-label='Toggle']
		driver.findElement(By.xpath("//*[@class=\"rct-collapse rct-collapse-btn\"]")).click();
		Thread.sleep(1000);
		
		WebElement check1=driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']"));
	
		
		////span[@class='rct-checkbox'][1]
		//*[contains(@xmlns,'http://www.w3.org/2000/svg')]
		//label[@for='tree-node-home']//span[@class='rct-checkbox']
		
		  List<WebElement> check=driver.findElements(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
		  System.out.println("total No. of check box="+check.size());
	
		  /*for(int i=0;i<=check.size();i++) 
		  {
			  check.get(i).click(); 
		  }*/
			
			  for(WebElement chbox:check) 
			  { 
				  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(chbox)).click();

				  chbox.click();
			  
			  } 	
			  boolean isChecked = check1.isSelected();
				System.out.println(isChecked);
			 // for(WebElement checkBox:allCheckBoxes)
//					{
//						try {
//							checkBox.click();
//						}
//						catch(StaleElementReferenceException e)
//						{
//							e.printStackTrace();
//							checkBox.click();
//						}
//					}

			 // Thread.sleep(2000);
			 
		//driver.close();
		driver.quit();
		
	}

}
