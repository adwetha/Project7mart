package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
WebDriver driver;
public ManageContactPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-primary btncss\"]")WebElement action;
@FindBy(xpath="//input[@name=\"phone\"]")WebElement phoneField;
@FindBy(xpath="//input[@id=\"email\"]")WebElement emailField;
@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement addressField;
@FindBy(xpath="//textarea[@placeholder=\"Enter Delivery Time\"]")WebElement deliverytimeField;
@FindBy(xpath="//input[@name=\"del_limit\"]")WebElement deliverychargelimitField;
@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-info\"]")WebElement update;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;

public ManageContactPage clickOnActionButton() {
	action.click();
	return this;
}
public ManageContactPage enterPhoneNo(String phoneno ) {
	phoneField.clear();
	phoneField.sendKeys(phoneno);
	return this;
}
public ManageContactPage enterEmailid(String email) {
	emailField.clear();
	emailField.sendKeys(email);
	return this;
}
public ManageContactPage enterAddress(String address) {
	addressField.clear();
	addressField.sendKeys(address);
	return this;
}public ManageContactPage enterDeliverytime(String deliverytime) {
	deliverytimeField.clear();
	deliverytimeField.sendKeys(deliverytime);
	return this;
}
public ManageContactPage enterDeliverycharge(String deliverycharge) {
	deliverychargelimitField.clear();
	deliverychargelimitField.sendKeys(deliverycharge);
	return this;
}
public ManageFooterPage clickOnUpdateButton() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, update);
	return new ManageFooterPage(driver);
}
public boolean isAlertDisplayed() {
	PageUtility pageutility=new PageUtility();
	return pageutility.isAlertDisplay(alert);
}
}
