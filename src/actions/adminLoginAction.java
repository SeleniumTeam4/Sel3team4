package actions;

import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

import interfaces.adminLoginPage;


public class adminLoginAction extends commonActions{
	WebDriver driver;
	public adminLoginAction(WebDriver driver){
		this.driver = driver;
	}
	
	public homePageAction login(String user, String pass){
		waitForControl(driver, interfaces.adminLoginPage.userNameTextbox);
		type(driver, interfaces.adminLoginPage.userNameTextbox, user);
		type(driver, interfaces.adminLoginPage.passwordTextbox, pass);
		click(driver, interfaces.adminLoginPage.loginButton);
		return PageFactory.getHomePage(driver);
	}
	
//	public adminLogin (WebDriver driver,String userName, String password){
//		adminLoginPage.userNameTextbox(driver).sendKeys(userName);
//		adminLoginPage.passwordTextbox(driver).sendKeys(password);
//		adminLoginPage.loginButton(driver).submit();
//	}
		
}
