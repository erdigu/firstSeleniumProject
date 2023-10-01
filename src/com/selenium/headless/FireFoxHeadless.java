package com.selenium.headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxHeadless {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(true);
		
		WebDriver driver= new FirefoxDriver(option);
		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("The title of page : "+ driver.getTitle());
		
		
	}

}
