package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageNews;

public class ManageNewsTest extends Base{
	@Test
	public void VerifyWhetherUserIsAbleToAddNews() {
		String username="admin";
		String password="admin";
		ManageNews managenews=new ManageNews(driver);
		managenews.enterUsernameOnUsernameField(username);
		managenews.enterPasswordOnPasswordField(password);
		managenews.ClickOnSignInButton();
		managenews.enterNewsInformation();
		boolean  AlertMessageManageNews=managenews. AlertMessageManageNews();
		assertTrue( AlertMessageManageNews,"News is not saved when user enter details and save");
	}
}
