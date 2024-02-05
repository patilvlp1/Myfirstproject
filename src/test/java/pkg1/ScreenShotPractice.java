package pkg1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://bhulekh.mahabhumi.gov.in/Nashik/pg712_changes.aspx");
		driver.manage().window().maximize();
		//convert webdriver object to takescreenShot ...down casting
		TakesScreenshot filef1=(TakesScreenshot)driver;
		
		//call getScrennshots method to create image file
		File src= filef1.getScreenshotAs(OutputType.FILE);
		
		//copy the file to desired location
		File dest=new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumFramework\\\\screenst\\\\UTARA.jpg");
		
		//copy file at destination
		FileHandler.copy(src, dest);
		
		
		driver.close();
		
		
		
	}

}
