package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	WebDriver driver;
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath="//input[@placeholder=\"Username\"]") WebElement usernameField;
	@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement PasswordField;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a")WebElement newsgetinfo;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")WebElement newnews;
	@FindBy(xpath="//textarea[@placeholder=\"Enter the news\"]")WebElement enternews;
	@FindBy(xpath="//button[@class=\"btn btn-danger\"]")WebElement newssave;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement newsalert;
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
		newsgetinfo.click();
	}
	public void clickOnNew() {
		newnews.click();
	}
	public void enterNewNews(String news) {
		enternews.sendKeys(news);
	}
	public void clickOnSave() {
		newssave.click();
	}
		public boolean AlertMessageManageNews() {
		return newsalert.isDisplayed();
	}
}
