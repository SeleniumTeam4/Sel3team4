package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import com.google.gson.annotations.Until;


public class commonActions {
		
	public void testImplicitWait(WebDriver driver) {
		   // This setup would be done once per driver execution.
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		   driver.findElement(By.id("myForm")).submit();
		   // Now the next page starts loading.
		 
		   // An attempt to find the element implicitly waits till it is ready.
		   WebElement result = driver.findElement(By.className("myResult"));
		   Assert.assertEquals("The Next Page", result.getText());
		}
	
	public static class browser {

		public static final WebDriver driver = new FirefoxDriver();

			public static WebDriver getDriver()
			{
				return driver;
			}
			public static void open(String url)
			{
				driver.get(url);
			}
			public static void close()
			{
				driver.close();
			}
	}
	
	
	public void waitForControl(WebDriver driver, String controlName){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = findElement(driver, controlName);
		
	}
	
	
	public void click(WebDriver driver, String controlName){
		WebElement element = findElement(driver, controlName);
		element.click();
	}
	
	public void type(WebDriver driver, String controlName, String value){
		WebElement element = findElement(driver, controlName);
		element.sendKeys(value);
	}
	
	
	public WebElement findElement(WebDriver driver, String control){
		System.out.println(control);
		return driver.findElement(By.xpath(control));
	}
}
