package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
	public ManageFooterPage footer;
	public AdminUserPage admin;
	public LoginPage login;
	public ManageContactPage contact;
@Test(description="Verify whther user can update the contact already saved")
public void VerifyWhetherUserIsAbleToUpdateManageContact() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String phoneno=ExcelUtility.getIntegerData(1, 2, "ManageContact");
	String emailid=ExcelUtility.getStringData(1, 3, "ManageContact");
	String address=ExcelUtility.getStringData(1, 4, "ManageContact");
	String deliverytime=ExcelUtility.getIntegerData(1, 5, "ManageContact");
	String deliverychargelimit=ExcelUtility.getIntegerData(1, 6, "ManageContact");
	login=new LoginPage(driver);
	login.enterUsername(username).enterPassword(password);
	admin=login.clickOnSignInButton();
	contact=login.clickMoreinfoButton();
	footer=contact.clickOnActionButton().enterPhoneNo(phoneno).enterEmailid(emailid).enterAddress(address).enterDeliverytime(deliverytime).enterDeliverycharge(deliverychargelimit).clickOnUpdateButton();
	boolean isAlertMessageDisplayed=contact.isAlertDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorManageContact);
}
}
