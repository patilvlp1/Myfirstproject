package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import test.SeleniumTest;

public class HomePage extends SeleniumTest{
	
	public static void clickoptonMenu()
	{
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	public static void clickOnlineProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//ul//li[text()='Online Products']")).click();
	}

}
