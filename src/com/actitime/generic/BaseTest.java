package com.actitime.generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * This class {@code BaseTest} is a abstract class which does not contain any test method.
 * for each and every execution of test case we have to perform some same methods so to perform this methods
 * we use some common methods this common methods are present in this class with annotations
  */

public abstract class BaseTest implements AutoConstant
{

	/**
	 * initialization of driver reference variable of type webdriver.
	 */
	public WebDriver driver;
	/**
	 * This method is executes before each and every test method
	 * @throws MalformedURLException 
	 * 
	 * 
	 **/
	@Parameters({"nodeUrl","browser","appUrl"})
	@BeforeMethod
	public void preCondition(String nodeUrl, String browser,String appUrl) throws MalformedURLException
	{
		URL url=new URL(nodeUrl);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browser);
		driver=new RemoteWebDriver(url,dc);
		driver.get(appUrl);
		
		/*System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
		System.setProperty(ie_key, ie_value);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");*/
		/*URL url=new URL("http://localhost:4444/wd/hub/");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		driver=new RemoteWebDriver(url, dc);
		driver.get("https://demo.actitime.com/login.do");*/
	}
	
	/**
	 * This method is execute after each and every test method
	 * 
	 * @param res
	 **/
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		String name = res.getMethod().getMethodName();
		int status = res.getStatus();
		if(status==2)
		{
			Reporter.log("taking screenshot",true);
		GenericUtils.getScreenshot(driver, name);
		}
		
		driver.close();
	}
	
}
