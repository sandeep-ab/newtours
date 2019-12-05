package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GRID_DataProvider {
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] data =new Object[1][3];
		data[0][0]="tutorial";
		data[0][1]="tutorial";
		data[0][2]="chrome";
		
		/*data[1][0]="tutorial";
		data[1][1]="tutorial";
		data[1][2]="firefox";*/
		
		return data;
	}
	
	@Test(dataProvider="getData")
	public void LogInTest(String username,String Password,String browser) throws MalformedURLException {
		System.out.println(browser);
		DesiredCapabilities cap= null;
		if(browser.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		/*else
			if(browser.equals("firefox"))
			{
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
		}*/
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.108:4444/wd/hub"),cap);
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}
}
