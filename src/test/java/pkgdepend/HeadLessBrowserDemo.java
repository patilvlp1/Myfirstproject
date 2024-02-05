package pkgdepend;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessBrowserDemo {
	public static void main(String[] args)
	{
		test();
	}
	
	
	public static void test(){
		
		
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver= new ChromeDriver(option);
		
		
		driver.get("https://www.google.co.uk/");
		System.out.println("Title is:-->"+driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		
		
		
	}

}
