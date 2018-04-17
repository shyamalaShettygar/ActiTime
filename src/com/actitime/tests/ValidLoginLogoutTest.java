package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test
	public void testValidLoginLogout()
	{
		String loginTitle = ExcelData.togetData("login", 1, 2);
		String user = ExcelData.togetData("login", 1, 0);
		String pass = ExcelData.togetData("login", 1, 1);
		String enterTimeTrackTitle = ExcelData.togetData("entertimetrack", 1, 0);
		
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//verify the login title
		lp.verifyTheTitle(loginTitle);
		//enter valid username
		Reporter.log("username is: "+user,true);
		lp.enterUserName(user);
		//enter valid password
		Reporter.log("password is: "+pass,true);
		lp.enterPassword(pass);
		//click on login button
		lp.clickOnLogin();
		//verify the home page title
		lp.verifyTheTitle(enterTimeTrackTitle);
		//click on logout link
		ep.clickOnLogout();
		//verify login page is displayed or not
		lp.verifyTheTitle(loginTitle);
		
	}

}
