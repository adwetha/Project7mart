package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
WebDriver driver;
public AdminUserPage(WebDriver driver) {
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
	public AdminUserPage clickOnMoreInfo() {
		moreinfo.click();
		return this;
}
	public AdminUserPage clickOnNewButton() {
		newadmin.click();
		return this;
	}
	public AdminUserPage enterAdminUser(String adminusername) {
		adminUserName.sendKeys(adminusername);
		return this;
	}
	public AdminUserPage enterAdminUserPassword(String adminpassword) {
		adminPassword.sendKeys(adminpassword);
		return this;
	}
	public AdminUserPage selectAdminUsertype() {
		PageUtility pageutility=new PageUtility();
        pageutility.selectByIndex(usertype, 1);
        return this;
	}
	public AdminUserPage clickOnSaveButton() {
		save.click();
		return this;
	}
	public boolean isAlertDisplayed() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alert);
	}
	public ManageContactPage clickOnLockButton() {
		lock.click();
		return new ManageContactPage(driver);
	}
	public boolean isAlertLockDisplayed() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alertmessage);
	}
	
	
	
	
	
}