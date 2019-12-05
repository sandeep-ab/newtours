package jquery_DragMeToMyTarget;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery_DragMeToMyTarget {

	public static void main(String[] args) {
		
		
		WebDriver driver=null;
		String url="http://jquery.com/droppable";
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

	}

}
