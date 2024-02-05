package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgGroups {
	@Test(groups="validlogin")
	public void validlogin()
	{
		System.out.println("Valid Login Method");
	}
	@Test(groups="Invalidlogin")
	public  void invalidlogin() {
		System.out.println("InValid Login Method");
		
	}
	
	/*
	 * @Test(groups="validlogin") public void validlogin2() {
	 * System.out.println("Valid2 Login Method"); }
	 */
	

}
