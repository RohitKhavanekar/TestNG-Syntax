package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 
{
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test(dataProvider = "getData")
	public void demo2(String username , String password)
	{
		System.out.println("Bye");
		System.out.println(username);
		System.out.println(password);
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
	
	@DataProvider
	public Object getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="firstusername";
		data[0][1]= "firstpassword";
		
		data[1][0] = "secondpassword";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdpassword";
		data[2][1] = "thirdpassword";
		
		return data;
	}

}
