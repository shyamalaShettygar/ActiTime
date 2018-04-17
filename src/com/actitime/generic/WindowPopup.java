package com.actitime.generic;

import java.io.IOException;

public class WindowPopup 
{
	public static void performAction(String command)
	{
		try
		{
			Runtime.getRuntime().exec(command);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
