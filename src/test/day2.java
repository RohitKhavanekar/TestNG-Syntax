package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day2 
{
	@Parameters({"url","Myname"})
	@Test
	public void homeloan(String urlname,String name)
	{
		System.out.println("HomeLoan");
		System.out.println(urlname);
		System.out.println(name);
	}
	
	
	@Test
	public void CarLoan()
	{
		System.out.println("Carloan");
	}
	
	@Test
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

