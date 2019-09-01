import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class TestSimpleWebSite {
    private WebDriver webDriver;

    public WebDriver createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/deelakaalgawatta/documents/chromedriver");
        webDriver = new ChromeDriver();
        PageFactory.initElements(webDriver, this);
        return webDriver;
    }

    public void closeWebDriver() {
        webDriver.close();
    }
}
