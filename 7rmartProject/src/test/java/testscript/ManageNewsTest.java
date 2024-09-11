package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test(description="Verify whether user can add new news to the manage news module")
	public void VerifyWhetherUserIsAbleToAddNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String news=ExcelUtility.getStringData(1, 2, "ManageNews");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickOnMoreInfo();
		managenews.clickOnNew();
		managenews.enterNewNews(news);
		managenews.clickOnSave();
		boolean  AlertMessageManageNews=managenews. isAlertManageNewsDisplayed();
		assertTrue( AlertMessageManageNews,Constants.ErrorManageNews);
	}
	@Test(description="Verify that user can delete the already existing news")
	public void verifyWhetherUserIsAbleToDeleteNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		ManageNewsPage managenews=new ManageNewsPage(driver);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
		managenews.clickOnMoreInfo();
		managenews.clickOnDelete();
		managenews.alertAfterDelete();
		boolean isAlertdisplayed=managenews.isAlertDisplayed();
		assertTrue(isAlertdisplayed,Constants.ErrorManageDeleteNews);
	}
}
