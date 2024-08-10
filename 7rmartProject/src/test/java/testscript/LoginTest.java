package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	@Test
public void VerifyWhetherUserIsAbleToLoginUsingValidCredentials() {
	String username="admin";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.ClickOnSignInButton();
	boolean ishomepageloaded=loginpage.isHomePageLoaded();
	assertTrue(ishomepageloaded,"Home page is not loaded when user enter valid credential");
	}
@Test
public void VerifyWhetherUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() {
	String username="sdcjnk";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.ClickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,"Home page is loaded when user enter invalid credential");
}
@Test
public void VerifyWhetherUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() {
	String username="admin";
	String password="ad123";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.ClickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,"Home page is loaded when user enter invalid credential");
}
@Test
public void VerifyWhetherUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() {
	String username="acjdsh";
	String password="ad123";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.ClickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,"Home page is loaded when user enter invalid credential");
}
}
