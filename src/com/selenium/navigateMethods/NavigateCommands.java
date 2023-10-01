package com.selenium.navigateMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");// replace gmail page on same tab
		System.out.println(driver.getTitle());
		
		driver.navigate().back();// it will open gmail
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();// it will open facebook
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();// it will refresh facebook page
		
		driver.close();
		
	}

}
