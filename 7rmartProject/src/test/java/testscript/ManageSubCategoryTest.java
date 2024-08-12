package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.ManageSubCategory;

public class ManageSubCategoryTest extends Base{
@Test
public void VerifyWhetherUserCanChangeStatus() {
	String username="admin";
	String password="admin";
	ManageSubCategory managesubcategory=new ManageSubCategory(driver);
	managesubcategory.enterUsernameOnUsernameField(username);
	managesubcategory.enterPasswordOnPasswordField(password);
	managesubcategory.ClickOnSignInButton();
	managesubcategory.clickOnMoreInfo();
	managesubcategory.clickOnActiveButton();
	boolean alertMessage=managesubcategory.alertMessage();
	assertTrue(alertMessage,"User is not able to update staus");
}
}
