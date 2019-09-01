import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaHomePage extends TestSimpleWebSite {

    protected WebDriver webDriver;

    @FindBy(id = "www-wikipedia-org")
    private WebElement wikipediaLogo;

    @FindBy(id = "js-link-box-en")
    public WebElement englishLanguage;

    public WikipediaHomePage() {
        webDriver = createWebDriver();
        webDriver.get("https://wikipedia.org");
    }

    public boolean isWikipediaPageLoaded() {
        return wikipediaLogo.isDisplayed();
    }

    public void selectLanguage() {
        englishLanguage.click();
    }
}
