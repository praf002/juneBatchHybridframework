package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//*[@href='/contacts']")
	WebElement contactLink;
	
	@FindBy(xpath="//*[@href='/companies']")
	WebElement companiesLink;
	
	
	@FindBy(xpath="//*[@href='/deals']")
	WebElement dealsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ContactPage clickOnContact() {
		contactLink.click();
		return new ContactPage();
	}
	
	
	public String validateTitle() {
		String actualTitle=driver.getTitle();
		return actualTitle;
	}

	public String validateurl() {
		String actualurl=driver.getCurrentUrl();
		return actualurl;
	}

}
