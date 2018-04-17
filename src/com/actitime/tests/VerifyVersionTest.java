package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test
	public void testVerifyVersion()
	{
		
		String loginTitle = ExcelData.togetData("login", 1, 2);
		String eVersion=ExcelData.togetData("login", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		//verify the login page
		lp.verifyTheTitle(loginTitle);
		//verify version
		String aVersion=lp.verifyVersion();
		Assert.assertEquals(eVersion, aVersion);
		Reporter.log("actual Version: "+aVersion,true);
		Reporter.log("versions are matching",true);
		
		
	}

}
