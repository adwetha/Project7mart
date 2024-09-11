package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageProductPage;
import utilities.ExcelUtility;

public class ManageProductTest extends Base{
	@Test(description="Verify that user is able to delete product from the manage product module")
	public void VerifyWhetherUserIsAbleToDeleteProductList() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
		ManageProductPage manageproduct=new ManageProductPage(driver);
		manageproduct.DeleteFromManageProduct();
		boolean isalertmessagedisplayed=manageproduct.isAlertDisplayed();
		assertTrue(isalertmessagedisplayed,Constants.ErrorManageProduct);
	}
}
