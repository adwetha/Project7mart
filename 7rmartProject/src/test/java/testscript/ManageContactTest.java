package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageContact;

public class ManageContactTest extends Base{
@Test
public void VerifyWhetherUserIsAbleToUpdateManageContact() {
	String username="admin";
	String password="admin";
	ManageContact managecontact=new ManageContact(driver);
	managecontact.enterUsernameOnUsernameField(username);
	managecontact.enterPasswordOnPasswordField(password);
	managecontact.clickOnSignInButton();
	managecontact.clickMoreinfoButton();
	managecontact.clickOnActionButton();
	managecontact.enterContactDetails();
	managecontact.clickOnUpdateButton();
	boolean alertMessage=managecontact.alertMessage();
	assertTrue(alertMessage,"Update is not done correctly when user enter valid datas");
}
}
