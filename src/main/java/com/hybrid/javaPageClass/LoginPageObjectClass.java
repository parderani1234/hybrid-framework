package com.hybrid.javaPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectClass {
 
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	WebElement loginbtn;
	
	
	
 public LoginPageObjectClass(WebDriver driver)
	 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void credentials(String username1,String passward)
	{
		username.sendKeys(username1);
		password.sendKeys(passward);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
}
