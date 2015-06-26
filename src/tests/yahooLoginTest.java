package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import actions.loginYahoo;
import org.testng.annotations.*;
import org.testng.asserts.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import actions.commonActions;
import interfaces.yahooLoginPage;

public class yahooLoginTest {
	WebDriver driver;
	loginYahoo objLogin ;
	WebElement page;
	FirefoxDriver firefox;
	commonActions common;
	yahooLoginPage loginPage;
	
	public yahooLoginTest() {
		driver  = new FirefoxDriver();
		objLogin = new loginYahoo(driver);
	}
	
	@BeforeTest
	public void beforeMethod(){
		driver.get("http://mail.yahoo.com");
	}
	
	@Test
	public void loginWithValidCredential(){
		//driver.get("http://mail.yahoo.com");
	/*	WebElement userName = driver.findElement(By.xpath("//input[@id='login-username']"));
		WebElement password =  driver.findElement(By.xpath("//input[@id='login-passwd']"));
		WebElement submit = driver.findElement(By.xpath("//button[@id='login-signin']"));
		
		userName.sendKeys("abc@yahoo.com");
		password.sendKeys("12345");
		submit.submit();*/
		
		//common.waitForElementVisible(20, (loginPage.userNameTextBox));
		objLogin.enterUserName("quanleminh464@yahoo.com");
		objLogin.enterPassword("@12345678");
		objLogin.clickLoginButton();
		
		
		Assert.assertTrue("Login successfull", driver.getTitle().contains("quanleminh464") );
	}
}
