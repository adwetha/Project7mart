package testscript;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
@Test(description="Verify that user can add new category to manage category")
public void verifyWhetherUserCanAddCategory ()throws IOException{
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String category=ExcelUtility.getStringData(1, 2, "ManageCategory");
	LoginPage loginpage=new LoginPage(driver);
	ManageCategory managecategory=new ManageCategory(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	managecategory.clickOnMoreInfo();
	managecategory.clickOnNewCategory();
	managecategory.enterCategoryOnCategoryField(category);
	managecategory.clickOnRequiredGroup();
	managecategory.chooseTheRequiredFile();
	managecategory.selectTheTopMenu();
	managecategory.selectTheLeftMenu();
	managecategory.clickOnSaveButton();
	boolean alertMessage=managecategory.alertIsDisplayed();
	assertTrue(alertMessage,Constants.ErrorManageCategory);
}
}
