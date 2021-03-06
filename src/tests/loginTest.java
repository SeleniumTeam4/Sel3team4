package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import interfaces.adminLoginPage;
import actions.PageFactory;
import actions.adminLoginAction;
import actions.commonActions;
import actions.commonActions.browser;
import dataTest.commonVariables;
import org.testng.annotations.*;
import interfaces.homePage;

public class loginTest {
	WebDriver driver;
	private adminLoginAction objadminLogin = new adminLoginAction(browser.getDriver());
	private actions.homePageAction objhomepage;
	private commonActions common;
	
	@BeforeMethod
	public void beforeMethod(){
		browser.getDriver();
		browser.open(commonVariables.initialPage);
		//common.waitForControl(driver, adminLoginPage.userNameTextbox);
		//objadminLogin = PageFactory.getAdminLogin(driver);
		
		
	}
	
	@Test
	public void loginValidCredential(){
		objhomepage = objadminLogin.login(commonVariables.userNameValid, commonVariables.passwordValid);
		objadminLogin = objhomepage.LogOut();
			
	}
	
	/*@AfterMethod
	public void afterMethod(){
		driver.close();
		driver.quit();
	}*/
}
