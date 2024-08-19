package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContact {
WebDriver driver;
public ManageContact(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@placeholder=\"Username\"]") WebElement usernameField;
@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement PasswordField;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-contact\"]")WebElement moreinfo;
@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-primary btncss\"]")WebElement action;
@FindBy(xpath="//input[@name=\"phone\"]")WebElement phoneField;
@FindBy(xpath="//input[@id=\"email\"]")WebElement emailField;
@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement addressField;
@FindBy(xpath="//textarea[@placeholder=\"Enter Delivery Time\"]")WebElement deliverytimeField;
@FindBy(xpath="//input[@name=\"del_limit\"]")WebElement deliverychargelimitField;
@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-info\"]")WebElement update;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
public void enterUsernameOnUsernameField(String username) {
	   usernameField.sendKeys(username);
	}
	public void enterPasswordOnPasswordField(String password) {
		PasswordField.sendKeys(password);
	}
	public void clickOnSignInButton() {
		LoginButton.click();
	}
public void clickMoreinfoButton() {
	moreinfo.click();
}
public void clickOnActionButton() {
	action.click();
}
public void enterContactDetailsPhoneNo(String phoneno ) {
	phoneField.clear();
	phoneField.sendKeys(phoneno);
}
public void enterContactDetailsEmailid(String email) {
	emailField.clear();
	emailField.sendKeys(email);
}
public void enterContactDetailsAddress(String address) {
	addressField.clear();
	addressField.sendKeys(address);
}public void enterContactDetailsDeleveritime(String deliverytime) {
	deliverytimeField.clear();
	deliverytimeField.sendKeys(deliverytime);
}
public void enterContactDetailsDeliverycharge(String deliverycharge) {
	deliverychargelimitField.clear();
	deliverychargelimitField.sendKeys(deliverycharge);
}
public void clickOnUpdateButton() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, update);
}
public boolean alertMessage() {
	PageUtility pageutility=new PageUtility();
	return pageutility.alertDisplay(alert);
}
}
