package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerfunction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement datepick=driver.findElement(By.xpath("//*[@class='hasDatepicker']"));
		datepick.click();
		
		while(true)
		{
			String title=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			System.out.println(title);
			
			if(title.equals("October 2023"))
			{
				int date=1;
				WebElement selectdate=driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']"));
			
				selectdate.click();
				Thread.sleep(1000);
				break;
			}else 
			{
				WebElement preBtn = driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]"));
				preBtn.click();
			}

			
		}
		

	}

}
