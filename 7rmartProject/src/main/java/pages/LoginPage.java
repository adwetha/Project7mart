package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	public void enterUsernameOnUsernameField(String username) {
	   usernameField.sendKeys(username);
	}
	public void enterPasswordOnPasswordField(String password) {
		PasswordField.sendKeys(password);
	}
	public void clickOnSignInButton() {
		LoginButton.click();
	}
	public boolean isHomePageLoaded() {
		return dashboard.isDisplayed();
	}
	public boolean isAlertMessageDisplayed() {
		return alert.isDisplayed();
	}
}
