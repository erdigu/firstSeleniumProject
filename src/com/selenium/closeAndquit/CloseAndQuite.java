package com.selenium.closeAndquit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuite {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.saucedemo.com/inventory.html");
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login =driver.findElement(By.name("login-button"));
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).click();
		
		
		driver.close();// it will close one window/tab of browser
		//driver.quit();// it will close multiple windows of browser
	}

}
