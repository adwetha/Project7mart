package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageFooter;
import utilities.ExcelUtility;

public class ManagerFooterTest extends Base{
@Test(description="Verify if user can update the footer in the manage footer module")
public void VerifyWhetherUserCanUpdateManageFooter() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String address=ExcelUtility.getStringData(1, 2, "ManageFooter");
	String email=ExcelUtility.getStringData(1, 3, "ManageFooter");
	String phoneno=ExcelUtility.getIntegerData(1, 4, "ManageFooter");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	ManageFooter managefooter=new ManageFooter(driver);
	managefooter.clickOnMoreInfoButton();
	managefooter.clickOnActionButton();
	managefooter.enterAddressOnAddressField(address);
	managefooter.enterEmailOnEmailField(email);
	managefooter.enterPhonenoOnField(phoneno);
	managefooter.clickOnUpdateField();
	boolean alertmessage=managefooter.alertDisplay();
	assertTrue(alertmessage,Constants.ErrorManageFooter);
}
}
