package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
	static WebDriver driver; 
	public static void m1(String browsername) throws InterruptedException
	{
		if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}else
			if(browsername.equals("FireFox")) 
		{
			driver=new FirefoxDriver();
		}else
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(1000);
		
		System.out.println("Current Url->"+driver.getCurrentUrl());
		//driver.close();
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		m1("Chrome");
		m1("Edge");
		m1("FireFox");
	}

}
