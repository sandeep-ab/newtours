package radiobuttons_echoecho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons_echoecho {

	public static void main(String[] args) {
		//http://www.echoecho.com/htmlforms10.htm
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver", ".//DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
	
		driver.get(url);
		///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
	
	WebElement radiobuttonsblock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement>radiobuttons=radiobuttonsblock.findElements(By.name("group1"));
	int radiobuttonscount=radiobuttons.size();
	System.out.println("The Number of radiobuttons are:"+radiobuttonscount);
	for(int i=0;i<radiobuttonscount;i++)
	{
		radiobuttons.get(i).click();
		
		for(int j=0;j<radiobuttonscount;j++)
		{
			System.out.println(radiobuttons.get(i).getAttribute("value")+"-"+radiobuttons.get(i).getAttribute("checked"));
			System.out.println(radiobuttons.get(j).getAttribute("value")+"-"+radiobuttons.get(j).isSelected());
	}
	
	
	
	
	}
	

}
}