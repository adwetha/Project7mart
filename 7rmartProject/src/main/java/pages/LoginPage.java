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
	@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-contact\"]")WebElement moreinfo;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a")WebElement moreinfofooter;
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")WebElement alert;	
	public LoginPage enterUsername(String username) {
	   usernameField.sendKeys(username);
	return this;
	}
	public LoginPage enterPassword(String password) {
		PasswordField.sendKeys(password);
		return this;
	}
	public AdminUserPage clickOnSignInButton() {
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, LoginButton);
		LoginButton.click();
		return new AdminUserPage(driver);
	}
	public ManageContactPage clickMoreinfoButton() {
		moreinfo.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterPage clickOnMoreInfoFooterButton() {
		moreinfofooter.click();
		return new ManageFooterPage(driver);
		}
	public boolean isHomePageLoaded() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(dashboard);
	}
	public boolean isAlertDisplayed() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(alert);
	}
}
