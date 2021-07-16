package com.TestLayer;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.ContactPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage1;

public class ContactPageTest extends BaseClass{
	LoginPage1 loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.intiliazation();
		 loginpage=new LoginPage1();
		 homepage=new HomePage();
		 contactpage=new ContactPage();
	}
	
	@Test(priority=1)
	public void loginpageFunctionality() {
		 loginpage.typeusername(prop.getProperty("username"));
		 loginpage.typepassword(prop.getProperty("password"));
		 loginpage.clickOnLoginButton();
	}

	@Test(priority=2)
	public void clickOnContactLink() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clickOnContact();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void checkEnabledStatus() {
		boolean actualStatus=contactpage.createButtonEnabledStatus();
		Assert.assertEquals(actualStatus, true);
	}
	
	@Test(priority=4)
	public void clickonCreateButton() {
		driver.navigate().refresh();
		contactpage.clickOnCreateButton();
		driver.navigate().refresh();
	}

	@Test(priority=5)
	public void createContact() throws InterruptedException {
		contactpage.typeFirstName(prop.getProperty("firstname"));
		contactpage.typeLastname(prop.getProperty("lastname"));
		contactpage.clickOnStatusButton();
		contactpage.clickOnActiveButton();
		Thread.sleep(10000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
