package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ExcelData implements AutoConstant
{


	public static String togetData(String sheetName,int rowNo,int cellNo)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(file_path));
			return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		} 
		catch (EncryptedDocumentException | InvalidFormatException | IOException e)
		{
			
			e.printStackTrace();
			return"";
		}
	}
	
	public static int getRowCount(String sheetName)
	{
		try 
		{
			FileInputStream fis=new FileInputStream(new File(file_path));
			return WorkbookFactory.create(fis).getSheet(sheetName).getLastRowNum();
		} 
		catch (EncryptedDocumentException | InvalidFormatException | IOException e)
		{
			
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int getCellCount(String sheetName,int rowNo)
	{
		try 
		{
			FileInputStream fis=new FileInputStream(new File(file_path));
			return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getLastCellNum();
		} 
		catch (EncryptedDocumentException | InvalidFormatException | IOException e)
		{
			
			e.printStackTrace();
			return 0;
		}
	}
}
