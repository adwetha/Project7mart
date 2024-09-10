package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageFooter {
		WebDriver driver;
		public ManageFooter(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
			
		}
		@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")WebElement moreinfo;
		@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1\"]")WebElement action;
		@FindBy(xpath="//textarea[@placeholder=\"Enter the Address\"]")WebElement addressField;
		@FindBy(xpath="//input[@id=\"email\"]")WebElement emailField;
		@FindBy(xpath="//input[@id=\"phone\"]")WebElement phonenoField;
		@FindBy(xpath="//button[@name=\"Update\"]")WebElement update;
		@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
			public void clickOnMoreInfoButton() {
				moreinfo.click();
				}
			public void clickOnActionButton() {
				WaitUtility waitutility=new WaitUtility();
				waitutility.waitForElementToBeClickable(driver, action);
				action.click();
			}
			public void enterAddressOnAddressField(String address) {
				addressField.clear();
				addressField.sendKeys(address);
			}
			public void enterEmailOnEmailField(String email) {
				emailField.clear();
				emailField.sendKeys(email);
			}
			public void enterPhonenoOnField(String phoneno) {
				phonenoField.clear();
				phonenoField.sendKeys(phoneno);
			}
			public void clickOnUpdateField() {
				update.click();
			}
			public boolean alertDisplay() {
				PageUtility pageutility=new PageUtility();
				return pageutility.isAlertDisplay(alert);
			}
}
