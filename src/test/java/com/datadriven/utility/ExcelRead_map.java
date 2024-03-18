package com.datadriven.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_map extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		excel_map();
	}
	
	
	public static void excel_map() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenFramework_Jan\\src\\test\\java\\Resource\\dataa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = book.getSheet("Sheet2");
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		
		
		for(int i=0;i<colcount;i++)
		{
		
			map.put(dataformat.formatCellValue(sheet.getRow(0).getCell(i)), dataformat.formatCellValue(sheet.getRow(1).getCell(i)));
			
		
		}
		
	
		System.out.println(map);
		
	
	}

	public static String getValueMap(String key) throws IOException
	{
		excel_map();
		return map.get(key);
	}
}
