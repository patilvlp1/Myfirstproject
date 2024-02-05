package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHadling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		Thread.sleep(2000);
		
		String Pwid=driver.getWindowHandle();
		System.out.println("Parent Window Id Is:->"+Pwid);
		
		//List<WebElement> wnd=driver.findElements(By.xpath("//a[@href='https://www.linkedin.com/in/ortoni/']"));
		 for(int i=1;i<4;i++)
		 {
			 
			 driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/in/ortoni/']")).click();
			 //driver.navigate().back();
		 } 
		// for(WebElement wndclick :wnd);
		 {
			 
		 }
		 
		 Set<String>allwnd=driver.getWindowHandles();
		 //Declare String Array
		
		String[] id= new String[allwnd.size()];
		System.out.println(allwnd.size());
		int i=0;
		for(String windowId:allwnd)
		{
			id[i]=windowId;
			i++;
		}
		driver.switchTo().window(id[2]);
		

	}

}
