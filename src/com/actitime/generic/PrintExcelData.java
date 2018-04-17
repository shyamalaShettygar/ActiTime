package com.actitime.generic;

public class PrintExcelData 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String data = ExcelData.togetData("sheet1", i,j );
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
