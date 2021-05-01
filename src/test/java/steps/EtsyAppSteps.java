package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EtsyHomePage;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;

public class EtsyAppSteps {

    WebDriver driver = Driver.getDriver();
    EtsyHomePage etsyHomePage = new EtsyHomePage();



    @Given("User navigates to Etsy application")
    public void user_navigates_to_Etsy_application() {
        driver.get(Configuration.getProperty("EtsyURL"));
    }

    @When("User searches for {string}")
    public void user_searches_for(String item) {
        etsyHomePage.searchBox.sendKeys(item, Keys.ENTER);

    }

    @Then("User validates search results contain")
    public void user_validates_search_results_contain(DataTable dataTable) {
        List<String> keyWords = dataTable.asList();//it will convert all values in List Of String values!
        //If your List of Integer or Double you should inside () write dataTable.asList(Integer.class);
        System.out.println(keyWords.get(0));//carpet
        System.out.println(keyWords.get(2));//oval rug
        //DataTable converting only: List, Map and List of List

        //way to get all carpet in web-side
        for(int i=0; i<etsyHomePage.resultItems.size(); i++){//from etsyHomePage.resultItems with is contains 64 items
            String itemDescription = etsyHomePage.resultItems.get(i).getText();
            System.out.println(itemDescription);
            boolean isFound = false;
            for(int a=0; a<keyWords.size(); a++){
                if(itemDescription.toLowerCase().contains(keyWords.get(a))){
                    isFound=true;
                }
            }
            Assert.assertTrue(itemDescription,isFound);
        }
    }
}
