package com.BrowserAutomating;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomating {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http:/facebook.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);


	}

}
