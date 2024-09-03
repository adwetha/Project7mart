
package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategory {
WebDriver driver;
public ManageCategory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@placeholder=\"Username\"]")WebElement usernameField;
@FindBy(xpath="//input[@placeholder=\"Password\"]")WebElement passwordField;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement LoginButton;
@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[4]/div/a")WebElement moreInfo;
@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Category/add\"]")WebElement newCategory;
@FindBy(xpath="//input[@placeholder=\"Enter the Category\"]")WebElement categoryField;
@FindBy(xpath="//li[@id=\"134-selectable\"]")WebElement selectGroup;
@FindBy(xpath="//input[@id=\"main_img\"]")WebElement chooseFile;
@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[1]/label[3]/input")WebElement showOnTopMenu;
@FindBy(xpath="/html/body/div/div[1]/section/div/div/div/div/form/div/div[4]/div[2]/label[3]/input")WebElement showOnLeftMenu;
@FindBy(xpath="//button[@class=\"btn btn-danger\"]")WebElement save;
@FindBy(xpath="//i[@class=\"icon fas fa-check\"]")WebElement alert;
public void enterUsernameOnUsernameField(String username) {
	usernameField.sendKeys(username);
}
public void enterPasswordOnPasswordField(String password) {
	passwordField.sendKeys(password);
}
public void clickOnSignInButton() {
	LoginButton.click();
}
public void clickOnMoreInfo() {
	moreInfo.click();
}
public void clickOnNewCategory() {
	newCategory.click();
}
public void enterCategoryOnCategoryField(String category) {
	categoryField.sendKeys(category);
}
public void clickOnRequiredGroup() {
	selectGroup.click();
}
public void chooseTheRequiredFile(){
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	fileuploadutility.fileUploadUsingSendKeys(chooseFile, Constants.HELMETIMAGE);
}
public void selectTheTopMenu() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, showOnTopMenu);
	//showOnTopMenu.click();
}
public void selectTheLeftMenu() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, showOnLeftMenu);
	//showOnLeftMenu.click();
}
public void clickOnSaveButton() {
	PageUtility pageutility=new PageUtility();
	pageutility.javaSriptClick(driver, save);
}
public boolean alertIsDisplayed() {
	PageUtility pageutility=new PageUtility();
	return pageutility.alertDisplay(alert);
}
}
