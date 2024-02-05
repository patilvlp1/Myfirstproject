package pkgdepend;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverDemo {

	public static void main(String[] args) {
		HtmlUnitDriver driver= new HtmlUnitDriver(BrowserVersion.EDGE);
		driver.get("https://www.selenium.dev/");
		System.out.println("Title is:-"+driver.getTitle());
		
		driver.quit();
		
		

	}

}
