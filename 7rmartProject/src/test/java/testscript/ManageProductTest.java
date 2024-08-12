package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageProduct;

public class ManageProductTest extends Base{
	@Test
	public void VerifyWhetherUserIsAbleToDeleteProductList() {
		String username="admin";
		String password="admin";
		ManageProduct manageproduct=new ManageProduct(driver);
		manageproduct.enterUsernameOnUsernameField(username);
		manageproduct.enterPasswordOnPasswordField(password);
		manageproduct.ClickOnSignInButton();
		manageproduct.DeleteFromManageProduct();
		boolean alertmessagedisplayed=manageproduct.alertMessageDisplayed();
		assertTrue(alertmessagedisplayed,"Product is not deleted when user try to delete it");
	}
}
