package com.hybrid.javaPageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class FundsObjectClass {

	public static WebDriver driver;
	 
	 @FindBy(xpath="//span[text()='Funds']")
	 WebElement funds;
	 
	 @FindBy(xpath="//button[@class='button-green']")
	 WebElement AddFunds;
	 
	 @FindBy(xpath="//input[@id='addfunds_amount']")
	 WebElement EnterAmount;
	 
	 @FindBy(xpath="//select[@id='segment_select']")
	public WebElement segment;
	 
	 @FindBy(xpath="//select[@id='account_select']")
 public	WebElement Account;
	 
	 @FindBy(xpath="//span[@class='rupee-symbol']")
	public WebElement rupees;
	 
	 
	 @FindBy(xpath="//input[@id='addfunds_vpa']")
		WebElement UpiIdSearchbox ;
		

	 @FindBy(xpath="//a[@href='https://console.zerodha.com/account/bank?ref=cashier']")
	 WebElement console;
	 
	
	@FindBy(xpath="//button[@id='addfunds_submit']")
	WebElement continuebutton;
	
   public	FundsObjectClass(WebDriver driver)
 
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	public void funds()
	{
		funds.click();
	}
	
	public void AddFunds()
	{
		AddFunds.click();
	}
	
	public void segment()
	{
		Select sc= new Select(segment);
		sc.selectByIndex(0);
		segment.click();
	}
	
	public void Account()
	{
		Select sc= new Select(Account);
		sc.selectByIndex(0);
		Account.click();
	}
	
	public void rupees()
	{
		 boolean a =rupees.isDisplayed();
		 System.out.println(a);
	}
	
	
/*	public void UpiIdSearchbox()
	{
		UpiIdSearchbox.sendKeys("");
	}
	
*/
		
	public void continuebutton()
	{
		continuebutton.click();
	}
	
	
	
}
