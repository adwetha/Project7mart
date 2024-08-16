package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUser;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
@Test
public void VerifyWhetherUserIsAbleToCreateNewUser() throws IOException {
	//String username="admin";
	//String password="admin";
	String username=ExcelUtility.getStringData(1, 0, "AdminUser");
	String password=ExcelUtility.getStringData(1, 1, "AdminUser");
	String adminusername=ExcelUtility.getStringData(1, 2, "AdminUser");
	String adminpassword=ExcelUtility.getStringData(1, 3, "AdminUser");
	AdminUser adminuser=new AdminUser(driver);
	adminuser.enterUsernameOnUsernameField(username);
	adminuser.enterPasswordOnPasswordField(password);
	adminuser.cickOnSignInButton();
	adminuser.clickOnMoreInfo();
	adminuser.clickOnNewButton();
	adminuser.enterAdminUserInformationUsernameField(adminusername);
	adminuser.enterAdminUserInformationPasswordField(adminpassword);
	adminuser.selectAdminUserInformationUsertype();
	adminuser.clickOnSaveButton();
	boolean alertMessage=adminuser.alertMessage();
	assertTrue(alertMessage,"User is not able to update staus");
}
}
