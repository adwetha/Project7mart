package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageProduct;
import utilities.ExcelUtility;

public class ManageProductTest extends Base{
	@Test(description="Verify that user is able to delete product from the manage product module")
	public void VerifyWhetherUserIsAbleToDeleteProductList() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "ManageProduct");
		String password=ExcelUtility.getStringData(1, 1, "ManageProduct");
		ManageProduct manageproduct=new ManageProduct(driver);
		manageproduct.enterUsernameOnUsernameField(username);
		manageproduct.enterPasswordOnPasswordField(password);
		manageproduct.ClickOnSignInButton();
		manageproduct.DeleteFromManageProduct();
		boolean alertmessagedisplayed=manageproduct.alertMessageDisplayed();
		assertTrue(alertmessagedisplayed,"Product is not deleted when user try to delete it");
	}
}
