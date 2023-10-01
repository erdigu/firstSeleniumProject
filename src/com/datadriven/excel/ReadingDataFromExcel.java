package com.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("D://selenium//study_material//ReadWriteFromJava.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file); //excel file
		XSSFSheet sheet= workbook.getSheet("empdetails"); //sheet name //or we can provide sheet index
		//XSSFSheet sheet= workbook.getSheetAt(0);//
	
		int rowCount = sheet.getLastRowNum();// row count is 11.
		int columnCount = sheet.getRow(0).getLastCellNum();// column/cell count
		
		for (int i = 0; i <rowCount; i++) {
			
		XSSFRow currentRow = sheet.getRow(i);
		
			for (int j = 0; j < columnCount; j++) {
				
				String cellValue = currentRow.getCell(j).toString();//getNumericCellValue if all column have numeric value.
				System.out.print("     "+cellValue);
				
			}
			
			System.out.println();
		}
	
	
	}

}
