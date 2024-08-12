package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUser {
WebDriver driver;
public AdminUser(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@placeholder=\"Username\"]") WebElement usernameField;
@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement PasswordField;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;	
@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")WebElement moreinfo;
@FindBy(xpath="//a[@onclick=\"click_button(1)\"]")WebElement newadmin;
@FindBy(xpath="//input[@name=\"username\"]")WebElement username;
@FindBy(xpath="//input[@name=\"password\"]")WebElement password;
@FindBy(xpath="//select[@name=\"user_type\"]")WebElement usertype;
@FindBy(xpath="//button[@name=\"Create\"]")WebElement save;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
public void enterUsernameOnUsernameField(String username) {
	   usernameField.sendKeys(username);
	}
	public void enterPasswordOnPasswordField(String password) {
		PasswordField.sendKeys(password);
	}
	public void ClickOnSignInButton() {
		LoginButton.click();
	}
	public void clickOnMoreInfo() {
		moreinfo.click();
}
	public void clickOnNewButton() {
		newadmin.click();
	}
	public void AdminUserInformation() {
		username.sendKeys("anagha");
		password.sendKeys("an36gh87a");
        Select dropdown=new Select(usertype);
        dropdown.selectByIndex(2);
	}
	public void clickOnSaveButton() {
		save.click();
	}
	public boolean alertMessage() {
		return alert.isDisplayed();
	}
	
	
	
	
	
	
	
}