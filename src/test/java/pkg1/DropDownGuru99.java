package pkg1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownGuru99 {
		public static void m1(WebDriver driver, String value) throws InterruptedException 
		{
		//WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='menu-item-3173']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[@id='menu-item-4622']")).click();
		System.out.println("Title is:"+driver.getTitle());
		
		List<WebElement>submenu=driver.findElements(By.xpath("//ul[@class='sub-menu clicked']//li"));
		
		System.out.println("Item Count Is:->"+submenu.size());
		
		for(WebElement item:submenu)
		{
			String itemvalue= item.getText();
			System.out.println(itemvalue);
			if(itemvalue.equalsIgnoreCase(value))
			{
				Thread.sleep(3000);
				item.click();
			}
			Thread.sleep(3000);	
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		m1(driver,"Cucumber");
	}

}
