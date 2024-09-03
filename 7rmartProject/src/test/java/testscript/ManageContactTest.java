package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageContact;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
@Test(description="Verify whther user can update the contact already saved")
public void VerifyWhetherUserIsAbleToUpdateManageContact() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "ManageContact");
	String password=ExcelUtility.getStringData(1, 1, "ManageContact");
	String phoneno=ExcelUtility.getIntegerData(1, 2, "ManageContact");
	String emailid=ExcelUtility.getStringData(1, 3, "ManageContact");
	String address=ExcelUtility.getStringData(1, 4, "ManageContact");
	String deliverytime=ExcelUtility.getIntegerData(1, 5, "ManageContact");
	String deliverychargelimit=ExcelUtility.getIntegerData(1, 6, "ManageContact");
	ManageContact managecontact=new ManageContact(driver);
	managecontact.enterUsernameOnUsernameField(username);
	managecontact.enterPasswordOnPasswordField(password);
	managecontact.clickOnSignInButton();
	managecontact.clickMoreinfoButton();
	managecontact.clickOnActionButton();
	managecontact.enterContactDetailsPhoneNo(phoneno);
	managecontact.enterContactDetailsEmailid(emailid);
	managecontact.enterContactDetailsAddress(address);
	managecontact.enterContactDetailsDeleveritime(deliverytime);
	managecontact.enterContactDetailsDeliverycharge(deliverychargelimit);
	managecontact.clickOnUpdateButton();
	boolean alertMessage=managecontact.alertMessage();
	assertTrue(alertMessage,"Update is not done correctly when user enter valid datas");
}
}
