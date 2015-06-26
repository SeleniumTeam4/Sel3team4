package actions;

import org.openqa.selenium.WebDriver;
import interfaces.createArticlePage;
import actions.homePageAction;
import actions.commonActions.browser;

public class createArticleAction extends commonActions {
	WebDriver driver;
	homePageAction homePage = new homePageAction(browser.getDriver());
	createArticlePage objcreateArticlePage = new createArticlePage();
	commonActions common;
	
	public createArticleAction(WebDriver driver){
		this.driver = driver;
	}
	
	public createArticleAction openNewArticlePage(){
		homePage.clickNavigationButton("Add New Article");
		return PageFactory.getCreateArticle(driver);
	}
	
	public void createNewArticle(String articleTitle, String articleContent){
		waitForControl(driver, objcreateArticlePage.titleTextbox);
		click(driver,objcreateArticlePage.titleTextbox);
		type(driver,objcreateArticlePage.titleTextbox,articleTitle);
		driver.switchTo().frame(objcreateArticlePage.aritleContentIframe);
		type(driver,objcreateArticlePage.aritleContent,articleContent);
	}
}
