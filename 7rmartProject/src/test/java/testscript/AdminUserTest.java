package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUser;

public class AdminUserTest extends Base{
@Test
public void VerifyWhetherUserIsAbleToCreateNewUser() {
	String username="admin";
	String password="admin";
	AdminUser adminuser=new AdminUser(driver);
	adminuser.enterUsernameOnUsernameField(username);
	adminuser.enterPasswordOnPasswordField(password);
	adminuser.ClickOnSignInButton();
	adminuser.clickOnMoreInfo();
	adminuser.clickOnNewButton();
	adminuser.AdminUserInformation();
	adminuser.clickOnSaveButton();
	boolean alertMessage=adminuser.alertMessage();
	assertTrue(alertMessage,"User is not able to update staus");
}
}
