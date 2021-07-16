package com.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheets;
	

	public ExcelReader(String excelpath)
	{
		File f=new File(excelpath);
		try {
			
		 fis=new FileInputStream(f);
		 workbook=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetIndex, int row, int cell) {
		 sheets=workbook.getSheetAt(sheetIndex);
		 String data=sheets.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int rows=workbook.getSheetAt(sheetIndex).getLastRowNum();
		rows=rows+1;
		return rows;
	}
	
	
	
}
