package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class EtsyHomePage {

    public EtsyHomePage() {
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id='content']//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//h3")
    public List<WebElement> resultItems;

}
