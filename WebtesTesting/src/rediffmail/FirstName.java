package rediffmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstName {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver=null;
			String url="https://mypage.rediff.com/login/dologin";
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			//Thread.sleep(10000);
			driver.get(url);
			driver.manage().window().maximize();
			WebElement create=driver.findElement(By.linkText("Create a Rediffmail account"));
			create.click();
		
			////*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
			//WebElement firstname=driver.findElement(By.xpath("//*[@id='tblcrtac']"));
			//<input type="text" onblur="fieldTrack(this);" name="name63269b75" value="" style="width:185px;" maxlength="61">
		  WebElement firstname=	driver.findElement(By.name("name63269b75"));
		  Thread.sleep(10000);
		  firstname.clear();
			firstname.sendKeys("sandeep");

		}

	

	}


