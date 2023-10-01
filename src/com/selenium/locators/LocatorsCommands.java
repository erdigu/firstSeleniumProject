package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsCommands {

	public static void main(String[] args) {

		// name and xpath locators we have already used.
		// now we use id and linkText.
		
		System.setProperty("webdriver.firefox.marionette", "D://selenium//drivers//geckodriver-v0.33.0_firefox-win64//gecokdriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("digvijayptemp@gmail.com");
			
	     driver.findElement(By.name("pass")).sendKeys("123456");
	     
	     
		//link text used for only href link.
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("digvijayptemp@gmail.com");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.linkText("Cancel")).click();
		
		
		//in cssSelector diff combinations like: tag&id,  tag&name , tag&class, tag&attribute, tag&class&attribute, innertext
		// below we used tag&id  here tag is "input" and id is "email"   use # between them
		driver.findElement(By.cssSelector("input#email")).sendKeys("digvijay@gmail.com");
		//tag&class  here tag is "a" and class is "_97w5"  use dot between them
		driver.findElement(By.cssSelector("a._97w5")).click();
				
				
		driver.close();
		
		
		
	}

}
