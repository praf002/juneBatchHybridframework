package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage1  extends BaseClass{
	
	//POM with page factory
	@FindBy(xpath="//input[@name='email' and @type='text']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement clickOnSubmit;
	// by using init element method we initilize page factory element/object
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void typepassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		clickOnSubmit.click();
	}
	
	

}
