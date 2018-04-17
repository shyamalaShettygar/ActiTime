                                                                                  package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	//declaration variables
	public WebDriver driver;
	
	//initilisazatin
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}

	//utilization
	public void verifyTitle(String eTitle)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching:"+eTitle,true);
		}
		catch(Exception e)
		{
			
			Reporter.log("Actual title is:"+driver.getTitle()+"\nexpected title is:"+eTitle,true);
			Reporter.log("Title Is not match",true);
			Assert.fail();
		}
	}
	
	public void verifyElement(WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log(element.getText()+"this element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element are not present",true);
			Assert.fail();
		}
	}
}