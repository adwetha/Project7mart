package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
@Test(description="Verify if user can change status of category from active to inactive and vise versa")
public void VerifyWhetherUserCanChangeStatus() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
	ManageSubCategoryPage managesubcategory=new ManageSubCategoryPage(driver);
	managesubcategory.clickOnMoreInfo();
	managesubcategory.clickOnActiveButton();
	boolean isAlertDisplayed=managesubcategory.isAlertDisplayed();
	assertTrue(isAlertDisplayed,Constants.ErrorManageSubCategory);
}
}
