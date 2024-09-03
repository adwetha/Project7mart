package testscript;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
@Test(description="Verify that user can add new category to manage category")
public void verifyWhetherUserCanAddCategory ()throws IOException{
	String username=ExcelUtility.getStringData(1, 0, "ManageCategory");
	String password=ExcelUtility.getStringData(1, 1, "ManageCategory");
	String category=ExcelUtility.getStringData(1, 2, "ManageCategory");
	ManageCategory managecategory=new ManageCategory(driver);
	managecategory.enterUsernameOnUsernameField(username);
	managecategory.enterPasswordOnPasswordField(password);
	managecategory.clickOnSignInButton();
	managecategory.clickOnMoreInfo();
	managecategory.clickOnNewCategory();
	managecategory.enterCategoryOnCategoryField(category);
	managecategory.clickOnRequiredGroup();
	managecategory.chooseTheRequiredFile();
	managecategory.selectTheTopMenu();
	managecategory.selectTheLeftMenu();
	managecategory.clickOnSaveButton();
	boolean alertMessage=managecategory.alertIsDisplayed();
	assertTrue(alertMessage,"User is not able to update staus");
}
}
