
package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test
	public void testInvalidLogin() throws InterruptedException
	{
		String loginTitle = ExcelData.togetData("login", 1, 2);
		String eErrorMessage = ExcelData.togetData("login", 1, 4);
		
		int loginRC = ExcelData.getRowCount("login");
		LoginPage lp=new LoginPage(driver);
		lp.verifyTheTitle(loginTitle);
		
		for(int i=2;i<=loginRC;i++)
		{
			Reporter.log("-------------------------------------------------------------------------------",true);
			String invalUname = ExcelData.togetData("login", i, 0);
			String invalPass=ExcelData.togetData("login", i, 1);
			Reporter.log("username is: "+invalUname,true);
			lp.enterUserName(invalUname);

			Reporter.log("password is: "+invalPass,true);
			lp.enterPassword(invalPass);
			lp.clickOnLogin();
			
			Thread.sleep(2000);
			String aErrorMessage=lp.getErrorMessage();
			Assert.assertEquals(aErrorMessage, eErrorMessage);
			Reporter.log("Error Message is Matching :"+eErrorMessage);
			Reporter.log("-------------------------------------------------------------------------------",true);
		}
		
	}

}
