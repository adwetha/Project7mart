package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageFooterPage {
		WebDriver driver;
		public ManageFooterPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
			
		}
		@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1\"]")WebElement action;
		@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement addressField;
		@FindBy(xpath="//input[@id=\"email\"]")WebElement emailField;
		@FindBy(xpath="//input[@id=\"phone\"]")WebElement phonenoField;
		@FindBy(xpath="//button[@name=\"Update\"]")WebElement update;
		@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
		
			public ManageFooterPage clickOnActionButton() {
				WaitUtility waitutility=new WaitUtility();
				waitutility.waitForElementToBeClickable(driver, action);
				action.click();
				return this;
			}
			public ManageFooterPage enterAddress(String address) {
				addressField.clear();
				addressField.sendKeys(address);
				return this;
			}
			public ManageFooterPage enterEmail(String email) {
				emailField.clear();
				emailField.sendKeys(email);
				return this;
			}
			public ManageFooterPage enterPhoneno(String phoneno) {
				phonenoField.clear();
				phonenoField.sendKeys(phoneno);
				return this;
			}
			public ManageNewsPage clickOnUpdateField() {
				update.click();
				return new ManageNewsPage(driver);
			}
			public boolean isAlertDisplayed() {
				PageUtility pageutility=new PageUtility();
				return pageutility.isAlertDisplay(alert);
			}
}
