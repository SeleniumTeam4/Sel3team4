package actions;

import org.openqa.selenium.WebDriver;
import interfaces.adminLoginPage;


public class adminLogin {
	public adminLogin (WebDriver driver,String userName, String password){
		adminLoginPage.userNameTextbox(driver).sendKeys(userName);
		adminLoginPage.passwordTextbox(driver).sendKeys(password);
		adminLoginPage.loginButton(driver).submit();
	}
	
	
	
	
}
