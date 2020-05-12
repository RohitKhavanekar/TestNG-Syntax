package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 
{
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Bye");
	}
	
	@BeforeTest
	public void demo3()
	{
		System.out.println("Exeute First");
	}
	
	@BeforeMethod
	public void demo4()
	{
		System.out.println("Running Before Every Method");
	}

}
