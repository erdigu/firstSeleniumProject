package com.datadriven.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcell {// we dont write anything in Excel. but we should know

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("D://selenium//study_material//WriteDataFromJava.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("Data");
		
		
		for (int i = 0; i <5; i++) 
		{
			
			XSSFRow currentrow = sheet.createRow(i);
				
				for (int j = 0; j < 3; j++) {
					
					if(i==0) {
						currentrow.createCell(0).setCellValue("firstname");
						currentrow.createCell(1).setCellValue("lastname");
						currentrow.createCell(2).setCellValue("address");
							}
					else if(i>0)	{	
					currentrow.createCell(j).setCellValue("xyz");}
				}
				
				
		}
		
		workbook.write(file);
		file.close();
		System.out.println("Data written in excel");
		
	}

}
