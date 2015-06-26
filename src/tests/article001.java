package tests;

import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import interfaces.adminLoginPage;
import interfaces.createArticlePage;
import actions.PageFactory;
import actions.adminLoginAction;
import actions.commonActions;
import actions.commonActions.browser;
import actions.createArticleAction;
import dataTest.commonVariables;
import org.testng.annotations.*;

import interfaces.homePage;


public class article001 {
	WebDriver driver;
	private createArticleAction objCreateArticleAction = new createArticleAction(browser.getDriver());
	private createArticlePage objCreateArticlePage;
	private adminLoginAction objadminLogin = new adminLoginAction(browser.getDriver());
	private actions.homePageAction objhomepage;
	
	@BeforeMethod
	public void beforeMethod(){
		browser.getDriver();
		browser.open(commonVariables.initialPage);
		//common.waitForControl(driver, adminLoginPage.userNameTextbox);
		//objadminLogin = PageFactory.getAdminLogin(driver);
		objhomepage = objadminLogin.login(commonVariables.userNameValid, commonVariables.passwordValid);
		
	}
	
	
	@Test
	public void createNewArticleTest(){
		objCreateArticleAction.openNewArticlePage();
		
	}
}
