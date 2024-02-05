package pkg1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Pwid=driver.getWindowHandle();
		System.out.println("Parent Window Id Is:->"+Pwid);
		
		WebElement parantwd= driver.findElement(By.xpath("//button[text()='New Tab']"));
		parantwd.click();
		Thread.sleep(2000);
		
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println("windows Size=>"+allwindow.size());
		
		Iterator<String>itr=allwindow.iterator();
		while(itr.hasNext()){
			String windows=itr.next();
			if(windows.equals(Pwid)) {
				System.out.println("Child window->"+windows);
				driver.switchTo().window(windows);		
			}		
		}
		WebElement childwd=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	
		System.out.println("Heading Of Child Window:->"+childwd.getText());
		
		driver.quit();
		
	}
	

}
