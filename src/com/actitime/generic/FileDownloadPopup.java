package com.actitime.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class FileDownloadPopup 
{

	public static void toselectSaveFileButton()
	{
		
		try 
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_S);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_S);
		}
		catch (AWTException e)
		{
			
			e.printStackTrace();
		}	
	}
	
	public static void toselectClickOnOk()
	{
		try 
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (AWTException e)
		{
			
			e.printStackTrace();
		}	
		
	}
}
