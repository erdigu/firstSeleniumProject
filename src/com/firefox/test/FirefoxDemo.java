package com.firefox.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) { 
		
		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//if browser window open in small. and have to maximize use below command
				//driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("mercury");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement login =driver.findElement(By.name("submit"));
		login.click();

String expectedTitle ="Login: Mercury Tours";// right click on page > select view page source > title is there. copy that.
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("test case pass");
		
		}
		else {
			System.out.println("test failed");
		}
		


		driver.close();

	}

}
