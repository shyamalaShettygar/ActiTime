package com.actitime.generic;


import org.openqa.selenium.WebElement;

public class FileUploadPopup 
{
	public static void sendFilepath(WebElement element,String path)
	{
		element.sendKeys(path);
	}

}
