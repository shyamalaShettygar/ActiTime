package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{

	
	@FindBy(id="username")
	private WebElement userNameTB;
	@FindBy(name="pwd")
	private WebElement passwordTB;
	@FindBy(xpath="//div[.='Login ']")
	
	
	private WebElement loginBTN;
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errorMSG;
	@FindBy(xpath="//nobr[contains(.,'actiTIME 2')]")
	private WebElement version;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void enterUserName(String un)
	{
		userNameTB.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		passwordTB.sendKeys(pwd);
	}
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public String getErrorMessage()
	{
		verifyElement(errorMSG);
		return errorMSG.getText();
	}
	public String verifyVersion()
	{
	
		return version.getText();
	}
	
}
