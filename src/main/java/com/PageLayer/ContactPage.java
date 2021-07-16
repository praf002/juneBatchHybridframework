package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.utils.JsMethods;
import com.utils.actionsClassMethods;

public class ContactPage extends BaseClass {
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement CreateButton;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="status")
	WebElement statusButton;
	
	@FindBy(xpath="//div[@name='status'][2]")
	WebElement activateButton;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean createButtonEnabledStatus() {
		
		return CreateButton.isEnabled();
	}
	
	public void clickOnCreateButton() {
		
		actionsClassMethods.clickOnElementByActionClass(CreateButton);
	}
	
	public void typeFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	
	public void typeLastname(String ln)
	{
		lastname.sendKeys(ln);
	}
	public void clickOnStatusButton() {
		statusButton.click();
	}
	
	public void  clickOnActiveButton() {
		activateButton.click();
	}

}
