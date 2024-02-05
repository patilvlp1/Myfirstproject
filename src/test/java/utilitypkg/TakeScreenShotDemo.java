package utilitypkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotDemo {

	
	public static void captureScreenShot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot scr	= (TakesScreenshot)driver;		
		File source = scr.getScreenshotAs(OutputType.FILE);
		
		//To save sc In project Folder
		String path=System.getProperty("user.dir")+"\\screenst\\"+filename+".png";
		System.out.println("Your Screen Shot On This Path:"+path);
		File destination=new File(path);
		FileHandler.copy(source, destination);
		
		 
	}
}
