package com.facebook;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_Login {
	Logger log=Logger.getLogger("Facebook_Login");
	WebDriver driver=null;
    String url="https://www.facebook.com/";
    @BeforeTest
    public void setup() {
    	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    @Test
    public void login() {
    	//<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
    	WebElement email=driver.findElement(By.name("email"));
    	email.sendKeys("sandeep");
    	//<input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
    	WebElement password=driver.findElement(By.name("pass"));
    	password.sendKeys("sandeep");
    	//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
    	WebElement login=driver.findElement(By.id("u_0_b"));
    	login.click();
    	
    	String url=driver.getCurrentUrl();
    	log.info(url);
    }
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
    
}
