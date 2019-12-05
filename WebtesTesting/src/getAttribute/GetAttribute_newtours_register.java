package getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_newtours_register {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		//<td class="mouseOut" width="77" height="33" align="center" onmouseout="changeStyle(this, 'mouseOut')" onmouseover="changeStyle(this, 'mouseOver')"><a href="mercuryregister.php">REGISTER</a></td>

		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String expected_Registerelementtext=register.getText();
		String expected_registerurladddress=register.getAttribute("href");
    	System.out.println("the expected url address is:"+expected_Registerelementtext);
    	register.click();

    	String actual_webpageurl=driver.getCurrentUrl();
    	System.out.println("the actual url address is:"+actual_webpageurl);
    	if(actual_webpageurl.equals(expected_registerurladddress))
    		
    	{
    		System.out.println("url matcher-pass");
    	}
    	else
    	{
    		System.out.println("url not matched-Fail");
    	}

		

	





	}

}
