package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import interfaces.yahooLoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loginYahoo {
	WebDriver driver;
	yahooLoginPage objLogin = new yahooLoginPage(); 
	
	public loginYahoo(WebDriver driver) {
		this.driver = driver; 
	}
		
	// Enter user name
	public void enterUserName(String strUserName){
		WebElement userName = driver.findElement(By.xpath(objLogin.userNameTextBox));
		userName.sendKeys(strUserName);
	}
	
	// Enter password
	public void enterPassword(String strPassword){
		WebElement password = driver.findElement(By.xpath(objLogin.passwordTextBox));
		password.sendKeys(strPassword);
	}
	
	// Click login button
	public void clickLoginButton(){
		WebElement loginButton = driver.findElement(By.xpath(objLogin.signInButton));
		loginButton.submit();
	}
	
}
