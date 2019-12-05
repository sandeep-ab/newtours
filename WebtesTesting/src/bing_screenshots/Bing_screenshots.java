package bing_screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Bing_screenshots {

	public static void main(String[] args) throws IOException {

		
			// TODO Auto-generated method stub
			WebDriver driver=null;
			String url="http://bing.com";
			System.setProperty("webdriver.chrome.driver", ".//DriverFiles/chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			File homepage_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Files.copy(bing_screenshots,new File("./Screenshots/bing.png"));
			
			Files.copy(homepage_screenshot, new File("./ScreenshotFiles/bing.png"));
			driver.quit();
					

	}

}
