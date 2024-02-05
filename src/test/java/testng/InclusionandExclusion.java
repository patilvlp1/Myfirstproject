package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InclusionandExclusion {
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("before class is running");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1 is running...");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 is running...");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 is running...");
	}

}
