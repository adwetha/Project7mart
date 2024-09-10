package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(retryAnalyzer=retry.Retry.class, description="Verify whether user is able to login with valid credentials",groups= {"Regression"})
public void VerifyWhetherUserIsAbleToLoginUsingValidCredentials() throws IOException {
	//String username="admin";
	//String password="admin";
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	boolean ishomepageloaded=loginpage.isHomePageLoaded();
	assertTrue(ishomepageloaded,Constants.ErrorLogin);
	}
@Test(retryAnalyzer=retry.Retry.class, description="Verify that user is not able to login with invalid username and valid password",groups= {"smoke"})
public void VerifyWhetherUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
	//String username="sdcjnk";
	//String password="admin";
	String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	String password=ExcelUtility.getStringData(2, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);
}
@Test(description="Verify that user is not able to login with valid username and invalid password")
public void VerifyWhetherUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {
	//String username="admin";
	//String password="ad123";
	String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);
}
@Test(dataProvider="LoginProvider",description="Verify that user is not able to login with invalid usernme and invalid password")
public void VerifyWhetherUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword(String username,String password) throws IOException {
	//String username="acjdsh";
	//String password="ad123";
	//String username=ExcelUtility.getStringData(4, 0, "LoginPage");
	//String password=ExcelUtility.getStringData(4, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	boolean isAlertMessageDisplayed=loginpage.isAlertMessageDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);
}
@DataProvider(name="LoginProvider")
	public Object[][] getDataFromTestData() throws IOException{
		return new Object[][] {{ExcelUtility.getStringData(4, 0, "LoginPage"),ExcelUtility.getStringData(4, 1, "LoginPage")},};
	}
}
