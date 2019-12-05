package com.OrangeHRM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Home_PageScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		File OrangeHRM_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(OrangeHRM_screenshot, new File("./ScreenshotFiles.png"));
	}

}
