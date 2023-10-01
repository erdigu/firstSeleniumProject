package com.chrome.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://selenium//drivers//chrome_win32//chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		//WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65535).build());
		
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		
		//if browser window open in small. and have to maximize use below command
		//driver.manage().window().maximize();
				
		
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
		

		driver.close();// it will close browser
	}

}
