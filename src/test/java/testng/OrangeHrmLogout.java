package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHrmLogout extends Orangehrmlogin{
	@Test(priority=1)
	public void logut() throws InterruptedException
	{
		Thread.sleep(2000);
		
		WebElement profile= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		profile.click();
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		
		
		
		
		
	}

}
