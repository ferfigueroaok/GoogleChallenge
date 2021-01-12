package GoogleTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTestCases extends GlobalSettings
{

	
    @Test(priority=1 , description="First scenario")
    public void SearchByGoogleSearchButton()
    {
    	String valueSearch = "The name of the wind";
    	
    	googleHomePage.Type(valueSearch);
    	googleHomePage.Search();
    	googleResultsPage.SelectFirstResult();    	
    	
    	Assert.assertEquals("Patrick Rothfuss - The Books", this.driver.getTitle());
    }
    
    @Test(priority=2 , description="Second scenario")
    public void SearchBySuggestions()
    {
    	String valueSearch = "The name of the wind";
    	
    	googleHomePage.Type(valueSearch);
    	googleHomePage.SelectFirstSuggestion();
    	googleResultsPage.SelectFirstResult();    	
    	
    	Assert.assertEquals("Patrick Rothfuss - The Books", driver.getTitle());
    }
    @Test(priority=3 , description="Extra scenario 1")
    public void SearchValidatingTheWikipediaPage()
    {
    	String valueSearch = "The name of the wind";
    	
    	googleHomePage.Type(valueSearch);
    	googleHomePage.Search();
    	googleResultsPage.SelectFirstResult();    	
    	
    	Assert.assertEquals("El nombre del viento - Wikipedia, la enciclopedia libre", driver.getTitle());
    }
    @Test(priority=4 , description="Extra scenario 2")
    public void SearchTryingToFindTheCorrectResult()
    {
    	String valueSearch = "The name of the wind";
    	
    	googleHomePage.Type(valueSearch);
    	googleHomePage.Search();
    	googleResultsPage.SelectResultFrom("www.patrickrothfuss.com");    	
    	
    	Assert.assertEquals("Patrick Rothfuss - The Books", driver.getTitle());
    }
}
