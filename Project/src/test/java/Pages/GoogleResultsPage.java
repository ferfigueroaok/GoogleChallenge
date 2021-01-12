package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleResultsPage {
		
		WebDriver driver;
		
		public GoogleResultsPage(WebDriver driver) {
			this.driver = driver;
		}				
		//WebElemnts
		private List<WebElement> ResultsLinks() { return driver.findElements(By.xpath("//h3//span//ancestor::a"));}

		//Actions

		public void SelectFirstResult() {
			ResultsLinks().get(0).click();
		}
		public void SelectResultFrom(String url) {
			for(WebElement element : ResultsLinks() ){
				if (element.getText().contains(url)) {
					element.click();
					break;
				}
			}
		}

}


