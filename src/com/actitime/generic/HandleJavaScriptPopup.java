package com.actitime.generic;

import org.openqa.selenium.WebDriver;

public class HandleJavaScriptPopup 
{
	public  static WebDriver driver;
	public static void toshiftAlertWindow()
	{
		driver.switchTo().alert();
	}
	
	public static void toClickOnOk()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void toClickOnCancel()
	{
		driver.switchTo().alert().dismiss();
	}

	public static String getText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void sendText(String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
}
