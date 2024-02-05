package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Onlineproduct;

public class SeleniumTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public static void intialSetup()
	{
		driver= new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/");
		
		HomePage.clickoptonMenu();
		HomePage.clickOnlineProduct();	
	}
	@Test(priority=0)
	public  void verifytitle() {
		Onlineproduct.formalverify();
		Onlineproduct.sporsthoesverify();
		Onlineproduct.sneekersverify();
		
		
	}
	@Test(priority=1)
	public void validateShoesList() {
		Onlineproduct.formalShoesList();
	}


}
