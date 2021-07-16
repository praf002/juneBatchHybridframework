package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JsMethods extends BaseClass{
	
	public static void clickObButtonByjs(WebElement wb) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",wb);
		
	}
	

}
