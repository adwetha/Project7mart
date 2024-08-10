package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduct {
	WebDriver driver;
	public ManageProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@placeholder=\"Username\"]") WebElement usernameField;
	@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement PasswordField;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")WebElement managegetinfo;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[9]/a[2]/i")WebElement deletemanageproduct;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement deletealert;
	public void enterUsernameOnUsernameField(String username) {
		   usernameField.sendKeys(username);
		}
		public void enterPasswordOnPasswordField(String password) {
			PasswordField.sendKeys(password);
		}
		public void ClickOnSignInButton() {
			LoginButton.click();
		}
	public boolean DeleteFromManageProduct() {
		managegetinfo.click();
		deletemanageproduct.click();
		driver.switchTo().alert().accept();
		return deletealert.isDisplayed();
	}
}
