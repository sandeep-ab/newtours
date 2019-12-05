package com.MouseoverOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HellosignIn_Yourorders_Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=null;
		String url="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	//id="nav-link-accountList"
		WebElement hellosignin=driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		
		action.moveToElement(hellosignin).perform();
		
		//<span class="nav-text">Your Orders</span>
		WebElement yourorders=driver.findElement(By.linkText("Your Orders"));
		
		yourorders.click();
		
		
				
		
	}

}
