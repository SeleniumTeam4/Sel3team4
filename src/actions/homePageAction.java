package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import actions.adminLoginAction;

public class homePageAction extends commonActions{
	WebDriver driver;
	public homePageAction(WebDriver driver){
		this.driver = driver;
	}
	
	public adminLoginAction LogOut(){
		waitForControl(driver, interfaces.homePage.LOGOUT_LINK);
		click(driver, interfaces.homePage.LOGOUT_LINK);
		
		return PageFactory.getAdminLogin(driver);
	}
	
	public void clickNavigationButton(String buttonName){
		String clickButton = "//span[contains(text(),'"+ buttonName+"')]";
		waitForControl(driver, clickButton);
		click(driver, clickButton);
	}
}
