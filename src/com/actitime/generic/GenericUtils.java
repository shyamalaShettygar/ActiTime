package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *this class {@code GenericUtils} represents the all the common methos we 
 are going to use in automation 
 */
public class GenericUtils 
{
	
	/**
	 * this method is use to take screenshot and store the .png file to screenshot folder. 
	 */
	public static void getScreenshot(WebDriver driver,String name)
	{
		try 
		{
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+name+".png");
		FileUtils.copyFile(src, dest);
		} 
		catch (IOException e) 
		{
		e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * This method is use to perform action on list box select the list box content using index
	 * @param element
	 * @param index
	 */
	public static void selectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * 
	 * This method is use to perform action on list box select the list box content using its value
	 * @param element
	 * @param value
	 */
	public static void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * 
	 * This method is use to perform action on list box select the list box content using its visibletext
	 * @param element
	 * @param text
	 */
	public static void selectByVisibleText(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method is use to perform action on list box deselect the list box content using its index
	 * @param element
	 * @param index
	 */
	public static void deselectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.deselectByIndex(index);
	}
	/**
	 * This method is use to perform action on list box deselect the list box content using its value
	 * @param element
	 * @param value
	 */
	public static void deselectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.deselectByValue(value);
	}
	/**
	 * This method is use to perform action on list box deselect the list box content using its visibletext
	 * @param element
	 * @param text
	 */
	public static void deselectByVisibleText(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.deselectByVisibleText(text);
	}
	/**
	 * This method is use to perform action on list box for deselect all the selected options
	 * @param element
	 */
	public static void deselectAll(WebElement element)
	{
		Select sel=new Select(element);
		sel.deselectAll();
		
	}
	
	/**
	 * This method is use to perform action on list box to get all options in listbox
	 * @param element
	 * @return
	 */
	
	public static List<WebElement> gelAllOptions(WebElement element)
	{
		Select sel=new Select(element);
		return sel.getOptions();
	}
	
	/**
	 * This method is use to perform action on list box to get all selected options in listbox
	 * @param element
	 * @return
	 */
	public static List<WebElement> getAllSelectedOptions(WebElement element)
	{
		Select sel=new Select(element);
		return sel.getAllSelectedOptions();
	}
	/**
	 * This method is use to perform action on list box to get first selected options in listbox
	 * @param element
	 * @return
	 */
	public static WebElement getFirstSelectedOption(WebElement element)
	{
		Select sel=new Select(element);
		return sel.getFirstSelectedOption();
		
	}
	/**
	 * This method is use to perform action on list box to check the listbox is multiple or not
	 * @param element
	 * @return
	 */
	
	public static boolean checkListBoxIsMultiple(WebElement element)
	{
		Select sel=new Select(element);
		return sel.isMultiple();
	}
	
	
	public static void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public static void doubleClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	public static void moveToElement(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public static void clickAndHold(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(target);
	}
	
	public static void contextClick(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.contextClick(target);
	}
	/**
	 * this method executes the java script statements.
	 * it take string as an argument in string we pass the java scripts
	 * @param driver
	 * @param script
	 */
	public static void javaScriptExecute(WebDriver driver,String script)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(script);
	}
	/**
	 * this method is use to scroll the webpage upto your specified element
	 * here element takes string as an argument we have to pass specified locator for that element
	 * @param driver
	 * @param element
	 */
	public static void scrollPageUsingJavaScriptExecutor(WebDriver driver,WebElement element)
	{
		int y=element.getLocation().getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,'"+y+"')");
	}
	/**
	 * this method is use to switch the frame using its index value type of int
	 * @param driver
	 * @param index
	 */
	public static void switchToFrameUsingIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * this method is use to switch the frame using its id and name passing as a string argument
	 * @param driver
	 * @param idName
	 */
	public static void switchToFrameUsingString(WebDriver driver,String idName)
	{
		driver.switchTo().frame(idName);
	}
	
	/**
	 * this method is use to switch the frame using its address of the frame
	 * @param driver
	 * @param element
	 */
	
	public static void switchToFrameUsingWebelement(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
}
