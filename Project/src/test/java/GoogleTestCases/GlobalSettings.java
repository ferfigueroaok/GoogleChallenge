package GoogleTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.GoogleHomePage;
import Pages.GoogleResultsPage;

public class GlobalSettings {
	
	protected WebDriver driver;
	protected GoogleHomePage googleHomePage;
	protected GoogleResultsPage googleResultsPage;
	
	public GlobalSettings() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	}

	@BeforeMethod
	public void Setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	driver.get("https://google.com");
    	
    	googleHomePage = new GoogleHomePage(driver);
    	googleResultsPage = new GoogleResultsPage(driver);
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.close();
		
	}
}
