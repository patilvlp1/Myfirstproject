package pkgdepend;

import org.testng.annotations.Test;

public class DemoClass {
	@Test(priority=-1)
	public void school()
	{
		System.out.println("++School is Running from package->pkgdend +++.");
	}
	
	@Test
	public void college()
	{
		System.out.println("College is Running...");
	}

}
