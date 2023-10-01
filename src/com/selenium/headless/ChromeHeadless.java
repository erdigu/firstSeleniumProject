package com.selenium.headless;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://selenium//drivers//chrome_win32//chromedriver.exe");
		
		
		ChromeOptions option = new ChromeOptions();
		//option.setHeadless(true); // way 1
		option.addArguments("--headless");// way 2. any ways we can use for headless browsing
		
		ChromeDriver driver= new ChromeDriver(option);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("The title of page : "+ driver.getTitle());
		}

}
