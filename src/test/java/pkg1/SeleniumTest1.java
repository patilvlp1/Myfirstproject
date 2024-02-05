package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions op= new ChromeOptions();// for window maximize way 1
		op.addArguments("start-maximized");
		//op.addArguments("--incognito");
		
		
		
		WebDriver driver= new ChromeDriver(op);
		Thread.sleep(2000);
		
		driver.get("https://www.orangehrm.com/");//way 2 for maximize
		
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.println("Orange HRM is Open");
		System.out.println("Tital name:>"+driver.getTitle());
		
		System.out.println("Current URL->"+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		//Thread.sleep(3000);
		
		driver.close();

	}

}
