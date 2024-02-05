package testng;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount=2)
	public void click()
	{
		System.out.println("login  Testcase1 is running");
	}
	@Test
	public void submit()
	{
		System.out.println("logout  Testcase2 is running");
	}

}
