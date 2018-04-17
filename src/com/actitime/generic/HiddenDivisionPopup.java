package com.actitime.generic;

import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup
{
	public static void clickOnElement(WebElement element)
	{
		element.click();
	}

	public static String getText(WebElement element)
	{
		return element.getText();
	}
	
	public static void enterText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
}
