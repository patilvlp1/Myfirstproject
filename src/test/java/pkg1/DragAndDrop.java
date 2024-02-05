package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		
		//frame handling
		WebElement freme=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(freme);
		
		//To Drag
		WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
		
		//Drop
		WebElement Dropable=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(draggable, Dropable).build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
