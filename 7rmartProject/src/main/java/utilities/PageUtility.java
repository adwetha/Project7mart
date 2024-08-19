package utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void messageAlert(WebDriver driver,String element) {
		driver.switchTo().alert().sendKeys(element);
	}
	public boolean alertDisplay(WebElement element) {
		return element.isDisplayed();
	}
	public boolean alertSelected(WebElement element) {
		return element.isSelected();
	}
	public boolean alertEnabled(WebElement element) {
		return element.isEnabled();
	}
	public void selectByVisibleText(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void selectByIndex(WebElement element,int no) {
		Select select=new Select(element);
		select.selectByIndex(no);
	}
	public void selectByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void deselectAll(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}
	public void deselectByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	public void deselectByVisibletext(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByVisibleText(value);
	}
	public void deselectByIndex(WebElement element,int no) {
		Select select=new Select(element);
		select.deselectByIndex(no);
	}
	public void dragAndDrop(WebDriver driver,WebElement element,WebElement element1) {
		Actions action=new Actions(driver);
		action.dragAndDrop(element, element1).build().perform();;
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();;
	}
	public void contextClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element);
	}
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();;
	}
	public void moveToFrames(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public String getWindowHandled(WebDriver driver) {
		 return driver.getWindowHandle();
		}
	public Set<String> getWindowsHandles(WebDriver driver,String element) {
		driver.switchTo().window(element);
		return driver.getWindowHandles();
	}
	public String getTitlte(WebDriver driver) {
		return driver.getTitle();
	}
	public String getUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}
	public void navigateTo(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}
	public void navigateRefreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}
}
