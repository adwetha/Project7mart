package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageContact;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
@Test(description="Verify whther user can update the contact already saved")
public void VerifyWhetherUserIsAbleToUpdateManageContact() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String phoneno=ExcelUtility.getIntegerData(1, 2, "ManageContact");
	String emailid=ExcelUtility.getStringData(1, 3, "ManageContact");
	String address=ExcelUtility.getStringData(1, 4, "ManageContact");
	String deliverytime=ExcelUtility.getIntegerData(1, 5, "ManageContact");
	String deliverychargelimit=ExcelUtility.getIntegerData(1, 6, "ManageContact");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	ManageContact managecontact=new ManageContact(driver);
	managecontact.clickMoreinfoButton().clickOnActionButton().enterContactDetailsPhoneNo(phoneno).enterContactDetailsEmailid(emailid).enterContactDetailsAddress(address).enterContactDetailsDeleveritime(deliverytime).enterContactDetailsDeliverycharge(deliverychargelimit).clickOnUpdateButton();
	boolean alertMessage=managecontact.isAlertDisplayed();
	assertTrue(alertMessage,Constants.ErrorManageContact);
}
}
