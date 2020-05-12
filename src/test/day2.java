package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups= {"Smoke"})
	public void homeloan()
	{
		System.out.println("HomeLoan");
	}
	
	@Test
	public void CarLoan()
	{
		System.out.println("Carloan");
	}
	
	@Test(dependsOnMethods = ("CarLoan"))
	public void PersonaLoan()
	{
		System.out.println("PersonalLoan");
	}
	@BeforeTest
	public void Runner()
	{
		System.out.println("Execute Last");
	}
	
	@BeforeMethod
	public void Bfmeth()
	{
		System.out.println("Running Before Methods");
	}
	
	@AfterMethod
	public void Afmeth()
	{
		System.out.println("Running after method");
	}
	

}

