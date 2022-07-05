package com.hybrid.TestClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.hybrid.javaPageClass.FundsObjectClass;
import com.hybrid.javaPageClass.LoginPageObjectClass;

import dev.failsafe.internal.util.Assert;

public class FundsTestClass extends BaseClass{
	
	@Test(priority=0)
	public void setup1()
	{
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void credentials(String username,String passward)
	{
		LoginPageObjectClass lp=new LoginPageObjectClass(driver);
	  lp.credentials("username", "passward");
		
		
	}
	
	@Test(priority=2)
	public void loginbtn()
	{
		LoginPageObjectClass lp=new LoginPageObjectClass(driver);
		lp.loginbtn();
	}
	
	
	

@Test(priority=3)
public void funds()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.funds();
}


@Test(priority=4)
public void Segment()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.segment();
	
}

@Test(priority=5)
public void Account()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.Account();
	
}

@Test(priority=6)
public void rupees()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.rupees();
	String Actualresult= fc.rupees.getText();
	String Expectedresult="₹";
	org.testng.Assert.assertEquals(Actualresult, Expectedresult);
	
}
/*
@Test
public void UpiIdSearchbox()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.UpiIdSearchbox();
}
*/                    


@Test(priority=7)
public void continuebutton()
{
	FundsObjectClass fc = new FundsObjectClass(driver);
	fc.continuebutton();

	
}

}
