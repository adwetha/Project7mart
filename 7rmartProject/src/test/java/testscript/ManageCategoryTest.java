package testscript;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
@Test(description="Verify that user can add new category to manage category")
public void verifyWhetherUserCanAddCategory ()throws IOException{
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	String category=ExcelUtility.getStringData(1, 2, "ManageCategory");
	LoginPage loginpage=new LoginPage(driver);
	ManageCategoryPage managecategory=new ManageCategoryPage(driver);
	loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
	managecategory.clickOnMoreInfo();
	managecategory.clickOnNewCategory();
	managecategory.enterCategoryField(category);
	managecategory.clickOnRequiredGroup();
	managecategory.chooseTheRequiredFile();
	managecategory.selectTheTopMenu();
	managecategory.selectTheLeftMenu();
	managecategory.clickOnSaveButton();
	boolean isAlertMessageDisplayed=managecategory.isAlertDisplayed();
	assertTrue(isAlertMessageDisplayed,Constants.ErrorManageCategory);
}
}
