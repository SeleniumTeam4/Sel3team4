package actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;


public class commonActions {
	WebDriver driver;
	
	public void testImplicitWait(WebDriver driver) {
		   // This setup would be done once per driver execution.
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		   driver.findElement(By.id("myForm")).submit();
		   // Now the next page starts loading.
		 
		   // An attempt to find the element implicitly waits till it is ready.
		   WebElement result = driver.findElement(By.className("myResult"));
		   Assert.assertEquals("The Next Page", result.getText());
		}
}
