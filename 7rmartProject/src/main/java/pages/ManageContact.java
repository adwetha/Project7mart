package pages;

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
@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-contact\"]")WebElement moreinfo;
@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-primary btncss\"]")WebElement action;
@FindBy(xpath="//input[@name=\"phone\"]")WebElement phoneField;
@FindBy(xpath="//input[@id=\"email\"]")WebElement emailField;
@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement addressField;
@FindBy(xpath="//textarea[@placeholder=\"Enter Delivery Time\"]")WebElement deliverytimeField;
@FindBy(xpath="//input[@name=\"del_limit\"]")WebElement deliverychargelimitField;
@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-info\"]")WebElement update;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
public ManageContact clickMoreinfoButton() {
	moreinfo.click();
	return this;
}
public ManageContact clickOnActionButton() {
	action.click();
	return this;
}
public ManageContact enterContactDetailsPhoneNo(String phoneno ) {
	phoneField.clear();
	phoneField.sendKeys(phoneno);
	return this;
}
public ManageContact enterContactDetailsEmailid(String email) {
	emailField.clear();
	emailField.sendKeys(email);
	return this;
}
public ManageContact enterContactDetailsAddress(String address) {
	addressField.clear();
	addressField.sendKeys(address);
	return this;
}public ManageContact enterContactDetailsDeleveritime(String deliverytime) {
	deliverytimeField.clear();
	deliverytimeField.sendKeys(deliverytime);
	return this;
}
public ManageContact enterContactDetailsDeliverycharge(String deliverycharge) {
	deliverychargelimitField.clear();
	deliverychargelimitField.sendKeys(deliverycharge);
	return this;
}
public ManageContact clickOnUpdateButton() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, update);
	return this;
}
public boolean isAlertDisplayed() {
	PageUtility pageutility=new PageUtility();
	return pageutility.isAlertDisplay(alert);
}
}
