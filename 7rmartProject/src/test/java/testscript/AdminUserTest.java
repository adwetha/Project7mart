package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUser;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
@Test(description="The testcase is created to verify whether user is able to create new user.We enter the user name and password and create a new user.")
public void VerifyWhetherUserIsAbleToCreateNewUser() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String adminusername=ExcelUtility.getStringData(1, 2, "AdminUser");
	String adminpassword=ExcelUtility.getStringData(1, 3, "AdminUser");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	AdminUser adminuser=new AdminUser(driver);
	adminuser.clickOnMoreInfo().clickOnNewButton().enterAdminUserInformationUsernameField(adminusername).enterAdminUserInformationPasswordField(adminpassword).selectAdminUserInformationUsertype().clickOnSaveButton();
	boolean alertMessage=adminuser.alertMessage();
	assertTrue(alertMessage,Constants.ErrorAdminUserUpdate);
}
@Test(description="The testcase verify whether user can lock and unlock the user to active and inactive state")
public void VerifyWhetherAdminCanChangeLockStatus() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	AdminUser adminuser=new AdminUser(driver);
	adminuser.clickOnMoreInfo().clickOnLockButton();
	boolean alertmessage=adminuser.alertLockMessage();
	assertTrue(alertmessage,Constants.ErrorAdminUserLock);
}
}
