package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
	public AdminUserPage admin;
	public LoginPage login;
	public ManageContactPage contact;
@Test(description="The testcase is created to verify whether user is able to create new user.We enter the user name and password and create a new user.")
public void VerifyWhetherUserIsAbleToCreateNewUser() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String adminusername=ExcelUtility.getStringData(1, 2, "AdminUser");
	String adminpassword=ExcelUtility.getStringData(1, 3, "AdminUser");
	login=new LoginPage(driver);
	admin=login.enterUsername(username).enterPassword(password).clickOnSignInButton();
	admin.clickOnMoreInfo().clickOnNewButton().enterAdminUser(adminusername).enterAdminUserPassword(adminpassword).selectAdminUsertype().clickOnSaveButton();
	boolean isAlertMessageDisplayed=admin.isAlertDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorAdminUserUpdate);
}
@Test(description="The testcase verify whether user can lock and unlock the user to active and inactive state")
public void VerifyWhetherAdminCanChangeLockStatus() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	login=new LoginPage(driver);
	admin=login.enterUsername(username).enterPassword(password).clickOnSignInButton();
	contact=admin.clickOnMoreInfo().clickOnLockButton();
	boolean isAlertMessageDisplayed=admin.isAlertLockDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorAdminUserLock);
}
}
