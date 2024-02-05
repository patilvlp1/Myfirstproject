package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggetionDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement serch=driver.findElement(By.xpath("//*[@id='APjFqb']"));
		serch.sendKeys("Selenium");
		
		List<WebElement> stxt=driver.findElements(By.xpath("//*[@jsname='bw4e9b']//li//span[text()='selenium webdriver']"));
		
		//String txtlist= stxt.size();
		
		

	}

}

