package headrerBlock_ElementNames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlock_ElementNames {

	public static void main(String[] args) {
	
		
		WebDriver driver=null;
		String url="https://www.tsrtc.telangana.gov.in/";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe"
				+ "");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement headerblock=driver.findElement(By.className("rtcNavigation"));
	
		
		List<WebElement>headerblockLinks=headerblock.findElements(By.tagName("a"));
		
		int headerblockLinkscount=headerblockLinks.size();
		
		System.out.println("the number of links in the headerblock are: "+headerblockLinkscount);
		for(int i=0;i<headerblockLinkscount;i++)
			
		{
			String headerblockLinkName=headerblockLinks.get(i).getText();
			System.out.println(i+" "+headerblockLinkName);
		}
			
				

	}




	
	

}
