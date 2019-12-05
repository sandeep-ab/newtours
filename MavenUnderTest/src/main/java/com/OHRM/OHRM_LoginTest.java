package com.OHRM;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LoginTest {
Logger log= Logger.getLogger("OHRM_LoginTest");
WebDriver driver=null;
    
String url="https://opensource-demo.orangehrmlive.com/";
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void login() {
	WebElement userName=driver.findElement(By.name("txtUsername"));
	userName.sendKeys("admin");
	
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys("password");
	
	WebElement login= driver.findElement(By.id("btnLogin"));
	login.click();
	
	String expected_HomepageTitle="OrangeHrm";
	log.info("The expected_HomepageTitle is:"+expected_HomepageTitle);
	String actual_WebPageTitle=driver.getTitle();
	log.info("The actual_WebPageTitle is:"+actual_WebPageTitle);
	
	if(actual_WebPageTitle.equals(expected_HomepageTitle)) {
		log.info("Login successfull - Pass");
	}
	else {
		log.info("Login Failed - Failed");
	}
	
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
		
	}




}
