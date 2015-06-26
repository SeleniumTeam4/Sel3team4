package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class administrationPage {
	public static WebElement logOutLink(WebDriver driver){
		 
		 WebElement element = null;
		 
		 element = driver.findElement(By.xpath("//span[@class='logout']/a"));

		 return element;

		}
}
