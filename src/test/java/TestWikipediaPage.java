import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TestWikipediaPage {
    private static WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();

    @AfterClass
    public static void tearDownClass() {
        wikipediaHomePage.closeWebDriver();
    }

    @Test
    public void testWikipediaHome() {
        Assert.assertTrue(wikipediaHomePage.isWikipediaPageLoaded());
        wikipediaHomePage.selectLanguage();
    }
}
