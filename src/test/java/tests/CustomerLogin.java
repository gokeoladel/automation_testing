package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import library.Constants;
import pages.CustomerPage;

public class CustomerLogin {
	WebDriver driver;
	
	@Test
	public void testCase1 (){
		CustomerPage custom = new CustomerPage(driver);
	//	custom.enterLogin(Constants.EMAIL, Constants.PASSWORD);
		
		custom.enterEmail(Constants.EMAIL);
		custom.enterPassword(Constants.PASSWORD);
		custom.loginButton();
	}
	
	
	@Before
	public void before() {
		driver = library.Browser.launch("edge");
		driver.get(Constants.URL);
	}
	
	
	
	
	
	
	
	
	
	
	

}
