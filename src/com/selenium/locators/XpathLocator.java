package com.selenium.locators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XpathLocator {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D://selenium//study material//readWriteFromJava.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");// sheet name we can provide
		// or we can provide sheet index
		//XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount= sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();// any row index we can provide. we just have to calculate cell count
		
		for (int i = 0; i < rowCount; i++)// iterate each row
		{
			XSSFRow currentrow= sheet.getRow(i);
			
			for (int j = 0; j < cellCount; j++) 
			{
				String value=currentrow.getCell(j).toString();// toString method for read value.// iterate current row cells
				//double value=currentrow.getCell(j).getNumericCellValue();
				//Always prefer toString value. becoz other cell has string value.
				System.out.print(" "+value);
			}
			System.out.println();
			
		}
	}

}
