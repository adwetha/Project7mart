package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageProduct {
	WebDriver driver;
	public ManageProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")WebElement managegetinfo;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[9]/a[2]/i")WebElement deletemanageproduct;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement deletealert;
	public void DeleteFromManageProduct() {
		managegetinfo.click();
		deletemanageproduct.click();
		PageUtility pageutility=new PageUtility();
		pageutility.acceptAlert(driver);
	}
	public boolean alertMessageDisplayed() {
		PageUtility pageutility=new PageUtility();
		return pageutility.isAlertDisplay(deletealert);
	}
}
