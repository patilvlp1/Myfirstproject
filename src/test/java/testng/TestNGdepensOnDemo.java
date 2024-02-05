package testng;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public  class TestNGdepensOnDemo {
	@Test()
	public void login()
	{
		System.out.println("Login Test 1 Run..");
		// Assert.fail();
		}
	@Test(dependsOnMethods="testng.TestngDemo.loginpage")
	public void menu()
	{
		System.out.println("Menu Test 2 Run..");
	}
	@Test
	public void Dashboard()
	{
		System.out.println("Dashboard Test 3 Run..");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout Test 4 Run..");
	}
}

