package pkg1; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownSelect {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr")
		 * ;
		 * 
		 * WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
		 */
		//Select sc= new Select(day);
		//sc.selectByIndex(4);
		//sc.selectByValue("10");
		//sc.selectByVisibleText("11");
		
		/*
		 * WebElement month1=driver.findElement(By.id("month")); Select sc1= new
		 * Select(month1); //sc1.selectByVisibleText("Oct"); // sc1.selectByIndex(6); //
		 * sc1.selectByValue("6");
		 * 
		 * List<WebElement> alloption=sc1.getOptions(); int allsize=alloption.size();
		 * System.out.println(allsize); // Using for each loop for(WebElement
		 * opt:alloption) { System.out.println(opt.getText()); } Thread.sleep(2000);
		 */
		 
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		////*[@id='withOptGroup']\"
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div")); 
		
		ele.click();
		
		Thread.sleep(2000);
		
		ele.sendKeys("Group 1, option 1");
		Thread.sleep(2000);
		
		
		
		
		/*for(WebElement element:ele)
		{  
			element.click();
			
			  String elements=element.getText();
			  if(elements.equalsIgnoreCase("Group 2, option 1")) 
			  {
			  elements.indexOf(elements); 
			  }
			  tem.out.println(elements);
			  
			 
		}
		/*
		 * Select sc = new Select(ele); sc.selectByVisibleText("Group 2, option 1");
		 * Thread.sleep(2000)
		 */;
		
		
		//div[@class=' css-1hwfws3']//input[@id='react-select-2-input']
		
		// driver.close();
		 
		 
		 
		
		
		
	}

}
