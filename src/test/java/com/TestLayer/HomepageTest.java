package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage1;

public class HomepageTest extends BaseClass{
	LoginPage1 loginpage;
	HomePage homepage;

	@BeforeClass
	public void setUp() {
		BaseClass.intiliazation();
	}
	
	@Test(priority=1)
	public void loginfunctinality() {
		 loginpage=new LoginPage1();
		 loginpage.typeusername(prop.getProperty("username"));
		 loginpage.typepassword(prop.getProperty("password"));
		 loginpage.clickOnLoginButton();
	}
	@Test(priority=2)
	public void validatTitle() {
		 homepage=new HomePage();
		String actualtitle= homepage.validateTitle();
		Assert.assertEquals(actualtitle, "Cogmento CRM");
	}

	@Test(priority=3)
	public void validateUrl() {
		String actualurl=homepage.validateurl();
		Assert.assertEquals(actualurl, "https://ui.cogmento.com/");
	}
	
	@Test(priority=4)
	public void clickOnContactLink() {
		homepage.clickOnContact();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
}
