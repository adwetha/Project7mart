package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test(description="Verify whether user can add new news to the manage news module")
	public void VerifyWhetherUserIsAbleToAddNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "ManageNews");
		String password=ExcelUtility.getStringData(1, 1, "ManageNews");
		String news=ExcelUtility.getStringData(1, 2, "ManageNews");
		ManageNews managenews=new ManageNews(driver);
		managenews.enterUsernameOnUsernameField(username);
		managenews.enterPasswordOnPasswordField(password);
		managenews.ClickOnSignInButton();
		managenews.clickOnMoreInfo();
		managenews.clickOnNew();
		managenews.enterNewNews(news);
		managenews.clickOnSave();
		boolean  AlertMessageManageNews=managenews. AlertMessageManageNews();
		assertTrue( AlertMessageManageNews,"News is not saved when user enter details and save");
	}
	@Test(description="Verify that user can delete the already existing news")
	public void verifyWhetherUserIsAbleToDeleteNews() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "ManageNews");
		String password=ExcelUtility.getStringData(1, 1, "ManageNews");
		ManageNews managenews=new ManageNews(driver);
		managenews.enterUsernameOnUsernameField(username);
		managenews.enterPasswordOnPasswordField(password);
		managenews.ClickOnSignInButton();
		managenews.clickOnMoreInfo();
		managenews.clickOnDelete();
		managenews.alertAfterDelete();
		boolean alertdisplayed=managenews.alertIsDisplayed();
		assertTrue(alertdisplayed,"User is not able to Delete news");
	}
}
