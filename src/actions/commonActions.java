package actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class commonActions {
	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	
	public void waitForElementVisible(long i, String elementLocation){
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementLocation)));
	}
}
