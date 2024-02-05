package testng;

import org.testng.annotations.Test;
public class TestngDemo {
	@Test
	public void loginpage()
	{
		System.out.println("**Loginpage TestCase 1 is Running from TestngDemo class**");
	}
	  @Test(priority=0,dependsOnMethods="pkgdepend.DemoClass.school")
	  public void
	  dashboard() { System.out.println("Dashboard TestCase 2 is Running"); }
	 
	@Test(priority=2)
	public void homepage()
	{
		System.out.println("Homepage-TestCase 3 is Running");
	}
	@Test(priority=3)
	public void logout(){
		System.out.println("logout--TestCase 4 is Running");	
	} 
	

}
