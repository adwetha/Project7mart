package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test(description="Verify whether user can add new news to the manage news module")
	public void VerifyWhetherUserIsAbleToAddNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String news=ExcelUtility.getStringData(1, 2, "ManageNews");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		ManageNews managenews=new ManageNews(driver);
		managenews.clickOnMoreInfo().clickOnNew().enterNewNews(news).clickOnSave();
		boolean  AlertMessageManageNews=managenews. AlertMessageManageNews();
		assertTrue( AlertMessageManageNews,Constants.ErrorManageNews);
	}
	@Test(description="Verify that user can delete the already existing news")
	public void verifyWhetherUserIsAbleToDeleteNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		ManageNews managenews=new ManageNews(driver);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		managenews.clickOnMoreInfo().clickOnDelete().alertAfterDelete();
		boolean alertdisplayed=managenews.alertIsDisplayed();
		assertTrue(alertdisplayed,Constants.ErrorManageDeleteNews);
	}
}
