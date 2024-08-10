package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
public WebDriver driver;
@BeforeTest
public void initialiseBrowser() {
	driver=new ChromeDriver();
	driver.get("https://groceryapp.uniqassosiates.com/admin");
	driver.manage().window().maximize();
}
@AfterTest
public void QuitAndClose() {
	driver.quit();
}
}
