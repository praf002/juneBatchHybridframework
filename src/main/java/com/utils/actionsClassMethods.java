package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class actionsClassMethods extends BaseClass{
	
	public static void clickOnElementByActionClass(WebElement wb) {
		Actions act=new Actions(driver);
		act.click(wb).build().perform();
	}

}
