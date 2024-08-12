package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
@FindBy(xpath="//input[@name=\"phone\"]")WebElement phone;
@FindBy(xpath="//input[@id=\"email\"]")WebElement email;
@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement address;
@FindBy(xpath="//textarea[@placeholder=\"Enter Delivery Time\"]")WebElement deliverytime;
@FindBy(xpath="//input[@name=\"del_limit\"]")WebElement deliverychargelimit;
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
public void enterContactDetails() {
	phone.sendKeys("9578246358");
	email.sendKeys("abc@gmail.com");
	address.sendKeys("abc house");
	deliverytime.sendKeys("4.20");
	deliverychargelimit.sendKeys("450");
}
public void clickOnUpdateButton() {
	update.click();
}
public boolean alertMessage() {
	return alert.isDisplayed();
}
}
