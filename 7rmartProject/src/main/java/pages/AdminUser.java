package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUser {
WebDriver driver;
public AdminUser(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")WebElement moreinfo;
@FindBy(xpath="//a[@onclick=\"click_button(1)\"]")WebElement newadmin;
@FindBy(xpath="//input[@name=\"username\"]")WebElement adminUserName;
@FindBy(xpath="//input[@name=\"password\"]")WebElement adminPassword;
@FindBy(xpath="//select[@name=\"user_type\"]")WebElement usertype;
@FindBy(xpath="//button[@name=\"Create\"]")WebElement save;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/a[1]")WebElement lock;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alertmessage;
	public void clickOnMoreInfo() {
		moreinfo.click();
}
	public void clickOnNewButton() {
		newadmin.click();
	}
	public void enterAdminUserInformationUsernameField(String adminusername) {
		adminUserName.sendKeys(adminusername);
	}
	public void enterAdminUserInformationPasswordField(String adminpassword) {
		adminPassword.sendKeys(adminpassword);
	}
	public void selectAdminUserInformationUsertype() {
		PageUtility pageutility=new PageUtility();
        pageutility.selectByIndex(usertype, 1);
	}
	public void clickOnSaveButton() {
		save.click();
	}
	public boolean alertMessage() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alert);
	}
	public void clickOnLockButton() {
		lock.click();
	}
	public boolean alertLockMessage() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alertmessage);
	}
	
	
	
	
	
}