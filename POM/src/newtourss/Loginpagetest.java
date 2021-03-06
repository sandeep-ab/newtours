package newtourss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newtours.LoginPage;

public class Loginpagetest {
	LoginPage pil=null;
	@Test(priority=1)
	public void hometest(WebDriver driver) {
		pil=PageFactory.initElements(driver, LoginPage.class);
		pil.home();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}
	@Test(priority=02)
	public void signontest(WebDriver driver) {
		pil=PageFactory.initElements(driver, LoginPage.class);
		pil.signon();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}
}
