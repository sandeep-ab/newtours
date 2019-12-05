package print_DynamicWebTableData_TimeandDtae;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_DynamiWebTableData_TimeandDate {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		WebElement webtable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		int rowscount=rows.size();
		for(int i=0;i<rowscount;i++)
	
		{
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		int colscount=cols.size();
		for(int j=0;j<colscount;j++)
		{
			String data=cols.get(j).getText();
			System.out.print(data+"  ");
		}
			System.out.println();
			//driver.quit();
		}
		}
			
		
		
///html/body/div[1]/div[6]/section[1]/div/section/div[1]
		
		
		
		
		
	}


