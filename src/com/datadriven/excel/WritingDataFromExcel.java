package com.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WritingDataFromExcel {

	
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "D://selenium//drivers//chrome_win32//chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
			//WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65535).build());
			
			driver.get("https://demo.guru99.com/test/newtours/");
								
			driver.manage().window().maximize();
			
			FileInputStream file= new FileInputStream("D://selenium//study_material//ReadWriteFromJava.xlsx");
			
			XSSFWorkbook workbook= new XSSFWorkbook(file); //excel file
			
			XSSFSheet sheet= workbook.getSheet("empdetails"); //sheet name //or we can provide sheet index
			//XSSFSheet sheet= workbook.getSheetAt(0);//
		
			int rowCount = sheet.getLastRowNum();// row count is 11.
			int columnCount = sheet.getRow(0).getLastCellNum();// column/cell count
			
		for (int i = 1; i <=rowCount; i++)
		{
				
			XSSFRow currentRow = sheet.getRow(i);
			
			int empId=	(int) currentRow.getCell(0).getNumericCellValue();
			String firstname=currentRow.getCell(1).getStringCellValue();
			String lastname= currentRow.getCell(2).getStringCellValue();
			int phone= (int) currentRow.getCell(3).getNumericCellValue();// type casting required because, it provides decimal numbers.
			String address= currentRow.getCell(4).getStringCellValue();
			String city= currentRow.getCell(5).getStringCellValue();
			String state= currentRow.getCell(6).getStringCellValue();
			int postalcode= (int) currentRow.getCell(7).getNumericCellValue();
			String country= currentRow.getCell(8).getStringCellValue();
			String password= currentRow.getCell(9).getStringCellValue();	
			String mail = currentRow.getCell(10).getStringCellValue();
			int salary = (int) currentRow.getCell(11).getNumericCellValue();
			
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Thread.sleep(4000);
			
			driver.findElement(By.name("firstName")).sendKeys(firstname);
			driver.findElement(By.name("lastName")).sendKeys(lastname);
			driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone));// need to provide only string values. so convert int into string
			driver.findElement(By.name("userName")).sendKeys(mail);	
			
			driver.findElement(By.name("address1")).sendKeys(address);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(postalcode));// need to provide only string values. so convert int into string
			
			Select countrylist = new Select(driver.findElement(By.name("country")));
			countrylist.selectByValue("INDIA");
			//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[108]")).sendKeys(country);
			
			
			driver.findElement(By.name("email")).sendKeys(mail);//username
			driver.findElement(By.name("password")).sendKeys(password);	
			driver.findElement(By.name("confirmPassword")).sendKeys(password);	
			
			driver.findElement(By.name("submit")).click();
			
			
			
			if(driver.getPageSource().contains("Thank you for registering"))
			{
				System.out.println("Registration Completed for row "+ i + "record");
			}
			else {
				System.out.println("Registration failed for row "+ i + "record");
				
			}
			
		}
		
		
			System.out.println("data driven test completed");
			
			driver.close();
			driver.quit();
			//file.close();
			
	}


}


