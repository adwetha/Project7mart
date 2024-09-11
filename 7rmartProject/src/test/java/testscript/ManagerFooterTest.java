package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageFooterPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManagerFooterTest extends Base{
	public ManageFooterPage footer;
	public AdminUserPage admin;
	public LoginPage login;
	public ManageNewsPage news;
@Test(description="Verify if user can update the footer in the manage footer module")
public void VerifyWhetherUserCanUpdateManageFooter() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String address=ExcelUtility.getStringData(1, 2, "ManageFooter");
	String email=ExcelUtility.getStringData(1, 3, "ManageFooter");
	String phoneno=ExcelUtility.getIntegerData(1, 4, "ManageFooter");
	login=new LoginPage(driver);
	login.enterUsername(username).enterPassword(password);
	admin=login.clickOnSignInButton();
	footer=login.clickOnMoreInfoFooterButton();
	news=footer.clickOnActionButton().enterAddress(address).enterEmail(email).enterPhoneno(phoneno).clickOnUpdateField();
	boolean alertmessage=footer.isAlertDisplayed();
	assertTrue(alertmessage,Constants.ErrorManageFooter);
}
}
