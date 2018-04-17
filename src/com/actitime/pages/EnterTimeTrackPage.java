package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;
import com.actitime.generic.HiddenDivisionPopup;

public class EnterTimeTrackPage extends BasePage
{

	
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement helpBTN;
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutYourActitime;
	@FindBy(xpath="//span[.='(build 40469)']")
	private WebElement buildNO;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement popupCloseBTN;
	
	public EnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	
	public void clickOnHelpMenu()
	{
		helpBTN.click();
	}
	
	public void clickOnYourActitime()
	{
		verifyElement(aboutYourActitime);
		aboutYourActitime.click();
	}
	
	public String getBuildNumber()
	{
		verifyElement(buildNO);
		return buildNO.getText();
	}
	
	public void closePopup()
	{
		HiddenDivisionPopup.clickOnElement(popupCloseBTN);
	}
}
