package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDemo {

	public static void main(String[] args)
	{
		WebDriver driver=  new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		driver.findElement(By.name("firstname")).sendKeys("Jony");
		
		driver.findElement(By.name("lastname")).sendKeys("Waker");
		
		driver.findElement(By.id("contactpoint_step_input")).sendKeys("8987654450");
		
		//radio button click
		
		driver.findElement(By.xpath("//*[@id=\"sex\" and @value=\"2\"]")).click();
		
		//day
		List<WebElement> days=driver.findElements(By.xpath("//*[@id=\'day\']//option"));
		
		for(WebElement day:days)
		{
			String dayss=day.getText();
			
			if(dayss.equalsIgnoreCase("7"))
			{
				day.click();
			}
			System.out.println(dayss);
		}
		//month
		//  //*[@id="month"]//option
		
        List<WebElement> month=driver.findElements(By.xpath("//*[@id=\'month\']//option"));
		
		for(WebElement months:month)
		{
			String monthss=months.getText();
			
			if(monthss.equalsIgnoreCase("Feb"))
			{
				months.click();
			}
			System.out.println(monthss);
		}
		
		//year
		List<WebElement> year=driver.findElements(By.xpath("//*[@id=\'year\']//option"));
		
		for(WebElement years:year)
		{
			String yearss=years.getText();
			
			if(yearss.equalsIgnoreCase("2023"))
			{
				years.click();
			}
			System.out.println(yearss);
		}
		//new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcde12345");
		//driver.close();

	}

}
