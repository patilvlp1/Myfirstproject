package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 
{	
	
	  @BeforeClass 
	  public void beforeclass() 
	  {
	  System.out.println("Before class...."); 
	  }
	  
	  @AfterClass 
	  public void Afterclass() 
	  {
		  System.out.println("After class....");
	  }
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method....");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method....");
	}
	@Test
	public void math()
	{
		System.out.println("math TestCase 1 running...");
	}
	@Test
	public void science()
	{
		System.out.println("science TestCase 2 running...");
	}
	@Test(priority=-1)
	public void computer()
	{
		System.out.println("computer TestCase 3 running...");
	}
	@Test
	public void Geomentry()
	{
		System.out.println("geomentry TestCase 4 running...");
	}
}
