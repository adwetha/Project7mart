package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSubCategoryPage {
WebDriver driver;
public  ManageSubCategoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(css="a.small-box-footer[href=\"https://groceryapp.uniqassosiates.com/admin/list-sub-category\"]")WebElement moreinfo;
@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Subcategory/status?id=527&st=inactive&page_ad=1\"]")WebElement active;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
	public void clickOnMoreInfo() {
		moreinfo.click();
	}
	public void clickOnActiveButton() {
		active.click();
	}
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
