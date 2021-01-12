package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {
		
		WebDriver driver;
		
		public GoogleHomePage(WebDriver driver) {
			this.driver = driver;
		}				
		//WebElemnts
		private WebElement InputSearch() { return driver.findElement(By.xpath("//input[@title='Buscar']"));}
		private WebElement BtnSearch() { return driver.findElement(By.xpath("//input[@value='Buscar con Google']"));}
		private List<WebElement> SuggestionsList() { return driver.findElements(By.xpath("//li"));}

		//Actions
		public void Type(String value) {
			InputSearch().sendKeys(value);
		}
		public void SelectFirstSuggestion() {
			
			new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("li")));
			
			SuggestionsList().get(0).click();
		}
		public void Search() {			
			BtnSearch().click();			
		};
	
}


