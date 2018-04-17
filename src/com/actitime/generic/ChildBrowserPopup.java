package com.actitime.generic;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ChildBrowserPopup
{
	public static String getTitleOfParentWindow(WebDriver driver)
	{
		return driver.switchTo().window(driver.getWindowHandle()).getTitle();
	}
	
	public static Set<String> getTitleOfAllWindows(WebDriver driver)
	{
	     Set<String> Titles =new HashSet<>();
	     for(String title:driver.getWindowHandles())
	     {
	    	driver.switchTo().window(title);
	    	Titles.add(driver.getTitle());
	    	
	     }
	     
	     return Titles;
	     
	}

	public static int getCountOfAllWindows(WebDriver driver)
	{
	
		return driver.getWindowHandles().size();
	}
}
