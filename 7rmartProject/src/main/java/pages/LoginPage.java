package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@placeholder=\"Username\"]") WebElement usernameField;
	@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement PasswordField;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
	@FindBy(xpath="//i[@class=\"nav-icon fas fa-th-large\"]") WebElement dashboard;
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")WebElement alert;	
	public LoginPage enterUsernameOnUsernameField(String username) {
	   usernameField.sendKeys(username);
	return this;
	}
	public LoginPage enterPasswordOnPasswordField(String password) {
		PasswordField.sendKeys(password);
		return this;
	}
	public LoginPage clickOnSignInButton() {
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, LoginButton);
		LoginButton.click();
		return this;
	}
	public boolean isHomePageLoaded() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(dashboard);
	}
	public boolean isAlertMessageDisplayed() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alert);
	}
}
