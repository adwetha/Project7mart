package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageSubCategory;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
@Test(description="Verify if user can change status of category from active to inactive and vise versa")
public void VerifyWhetherUserCanChangeStatus() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	ManageSubCategory managesubcategory=new ManageSubCategory(driver);
	managesubcategory.clickOnMoreInfo().clickOnActiveButton();
	boolean alertMessage=managesubcategory.alertMessage();
	assertTrue(alertMessage,Constants.ErrorManageSubCategory);
}
}
