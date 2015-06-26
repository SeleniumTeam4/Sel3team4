package actions;

import org.openqa.selenium.WebDriver;

public class PageFactory {

	public static adminLoginAction getAdminLogin(WebDriver driver){
		return new adminLoginAction(driver);
	}
	
	public static homePageAction getHomePage(WebDriver driver){
		return new homePageAction(driver);
	}
	
	public static createArticleAction getCreateArticle(WebDriver driver){
		return new createArticleAction(driver);
	}
}
