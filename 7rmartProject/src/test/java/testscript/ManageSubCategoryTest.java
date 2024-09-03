package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.ManageSubCategory;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
@Test(description="Verify if user can change status of category from active to inactive and vise versa")
public void VerifyWhetherUserCanChangeStatus() throws IOException {
	String username=ExcelUtility.getStringData(1, 0, "ManageSubCategory");
	String password=ExcelUtility.getStringData(1, 1, "ManageSubCategory");
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
