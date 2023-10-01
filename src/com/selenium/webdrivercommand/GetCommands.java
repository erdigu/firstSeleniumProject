package com.selenium.webdrivercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		String text = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(text);
		
		driver.close();// close current window
		driver.quit();// close multiple windows
	}

}
