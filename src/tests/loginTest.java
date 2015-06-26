package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import interfaces.adminLoginPage;
import actions.adminLogin;
import org.testng.annotations.*;
import interfaces.administrationPage;

public class loginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.190.135/Joomla_2.5.28/administrator/");
	}
	
	@Test
	public void loginValidCredential(){
		adminLogin login = new adminLogin(driver, "team4admin", "P12345678");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("Control Panel"), "Login success");
		administrationPage.logOutLink(driver).click();
	}
	
	@AfterMethod
	public void afterMethod(){
		driver.close();
		driver.quit();
	}
}
