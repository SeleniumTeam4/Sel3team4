package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class adminLoginPage {
	
	private static WebElement element;
	
	public static WebElement userNameTextbox(WebDriver driver){
		 
		  element = driver.findElement(By.xpath("//input[@id='mod-login-username']"));

		 return element;

		}
	
	public static WebElement passwordTextbox(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("//input[@id='mod-login-password']"));

		 return element;

		}
	
	public static WebElement loginButton(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));

		 return element;

		}
}
