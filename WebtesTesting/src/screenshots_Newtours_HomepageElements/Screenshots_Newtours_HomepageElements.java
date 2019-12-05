package screenshots_Newtours_HomepageElements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots_Newtours_HomepageElements {

	public static void main(String[] args) throws IOException {
		
		

		WebDriver driver=null;
		String url ="http://www.newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int linkscount = Links.size();
		System.out.println("The total number of links are"+linkscount);
		
		for(int i=0;i<linkscount;i++) {
			String LinksName=Links.get(i).getText();
			System.out.println(i+"----------"+LinksName);
			Links.get(i).click();
			File Links_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	     	Files.copy(Links_screenshot,new File("./ScreenshotFiles/"+LinksName+".png"));
		//	Files.copy(Links_screenshot,new File("./Screenshots/newtours.png"));	
			driver.navigate().back();
			Links=driver.findElements(By.tagName("a"));
			
		}

	}




	}


