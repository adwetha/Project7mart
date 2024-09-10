package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNews {
	WebDriver driver;
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/a")WebElement newsgetinfo;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")WebElement newnews;
	@FindBy(xpath="//textarea[@placeholder=\"Enter the news\"]")WebElement enternews;
	@FindBy(xpath="//button[@class=\"btn btn-danger\"]")WebElement newssave;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement newsalert;
	@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/news/delete?del=1682&page_ad=1\"]")WebElement delete;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement deleteAlert;
	public ManageNews clickOnMoreInfo() {
		newsgetinfo.click();
		return this;
	}
	public ManageNews clickOnNew() {
		newnews.click();
		return this;
	}
	public ManageNews enterNewNews(String news) {
		enternews.sendKeys(news);
		return this;
	}
	public ManageNews clickOnSave() {
		newssave.click();
		return this;
	}
		public boolean AlertMessageManageNews() {
			PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(newsalert);
	}
		public ManageNews clickOnDelete() {
		  delete.click();
		return this;
		}
		public ManageNews alertAfterDelete() {
			PageUtility pageutility=new PageUtility();
			pageutility.acceptAlert(driver);
			return this;
		}
		public boolean alertIsDisplayed() {
			PageUtility pageutility=new PageUtility();
			return pageutility.isAlertDisplay(deleteAlert);
		}
}
