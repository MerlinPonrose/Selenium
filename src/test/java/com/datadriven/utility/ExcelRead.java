package com.datadriven.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

public static Object[][] excelread() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenFramework_Jan\\src\\test\\java\\Resource\\dataa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		String data[][] = new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				XSSFCell cell = sheet.getRow(i).getCell(j);
				
				cell.setCellType(CellType.STRING);
				
				
				 data[i-1][j] = cell.getStringCellValue();
				
							
			
			}
		}
		return data;
		
		 
	}
}
