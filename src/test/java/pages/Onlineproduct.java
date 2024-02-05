package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import test.SeleniumTest;

public class Onlineproduct extends SeleniumTest {
	
	
		public static String formalshoes="//*[@class='FormalShoesTitle']";
		public static String sportsshoes="//*[@class='SportsShoesTitle']";
		public static String sneekers="//*[@class='SneakerShoesTitle']";
		
		public static void  formalverify()
		{
			String actualformal=driver.findElement(By.xpath(formalshoes)).getText();
			
			//System.out.println(actualformal);

			String ExpectedFormalShoes="Formal Shoes";
			
			Assert.assertEquals(actualformal, ExpectedFormalShoes);

			if(ExpectedFormalShoes.equals(actualformal)) {
				System.out.println("Verified the shoe type name is = "+actualformal);
			}else {
				System.out.println("The shoe type name is wrong");
			}
			
		}
		public static void sporsthoesverify() {
			String actualsport=driver.findElement(By.xpath(sportsshoes)).getText();	
			//System.out.println(actualsport);
			
			String Expectedsportsshoe="Sports Shoes";
			
			Assert.assertEquals(actualsport, Expectedsportsshoe);

			if(Expectedsportsshoe.equals(actualsport)) {
				System.out.println("Verified the sportsshoe type name is = "+actualsport);
			}else {
				System.out.println("The sportsshoe type name is wrong");
			}
		}
		public static void sneekersverify()
		{
			String actualSneakers=driver.findElement(By.xpath(sneekers)).getText();
			//System.out.println(actualSneakers);
			String ExpectedSneakers="Sneakers";
			Assert.assertEquals(actualSneakers, ExpectedSneakers);

			if(ExpectedSneakers.equals(actualSneakers)) {
				System.out.println("Verified the Sneakers type name is = "+actualSneakers);
			}else {
				System.out.println("The Sneakers type name is wrong");
			}
		}
		public static void formalShoesList() {
			WebElement formalshoedropdown = driver.findElement(By.xpath("//i[@class='fa fa-angle-double-down formalshoedropdown']"));
			formalshoedropdown.click();
			
			
			WebElement ClassicCheltenham=driver.findElement(By.xpath("//table//td[text()='   Classic Cheltenham']")); 

			String actualFormalShoeName = ClassicCheltenham.getText();
			//verify actual Name
			System.out.println(actualFormalShoeName);
			
			String ExpFormalShoeName="   Classic Cheltenham";
			if(ExpFormalShoeName.equals(actualFormalShoeName)) {
				System.out.println("shoe name is = "+actualFormalShoeName);
			}else {
				System.out.println("The formal shoe name is wrong");
			}
			
		}
			public static void sportShoesLists () {
				WebElement sportshoedropdown = driver.findElement(By.xpath(""));
				
				
				
				
			}


		}

	

}
