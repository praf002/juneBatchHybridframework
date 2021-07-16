package com.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import com.PageLayer.LoginPage1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends BaseClass {
	
			
	LoginPage1 loginpage1;
	
	@BeforeClass
	public void setUp() {
		BaseClass.intiliazation();
	}
	@Test
	public void loginFunctinality() {
		loginpage1=new LoginPage1();
		loginpage1.typeusername(prop.getProperty("username"));
		loginpage1.typepassword(prop.getProperty("password"));
		loginpage1.clickOnLoginButton();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
