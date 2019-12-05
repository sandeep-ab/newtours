package com.OHRMApplicationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LogInTest {
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";
@Given("^Oprn Chrome Browser and  Navigate to OrangeHrm Application$")
public void Oprn_Chrome_Browser_and_Navigate_to_OrangeHrm_Application()
{
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}


@When("^User Enters Username and Password and click on LogIn Button$")

public void User_Enters_Username_and_Password_and_click_on_LogIn_Button() {
	//<input name="txtUsername" id="txtUsername" type="text">
	WebElement userName=driver.findElement(By.id("txtUsername"));
	userName.sendKeys("Admin");
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();
	

}
@Then("^User should be Able to Successfully logIn to the Apllication and close the Application$")
public void User_should_be_Able_to_Successfully_logIn_to_the_Apllication_and_close_the_Application() throws Throwable {
	String url=driver.getCurrentUrl();
	System.out.println("The Title of the load page url is"+url);
	driver.quit();
    
}

}


