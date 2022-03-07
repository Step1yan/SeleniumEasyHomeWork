package JavaSelen;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FirstTest extends Hooks {

    @Test
    public void firstTest() {
        BasePage BasePage = PageFactory.initElements(driver, BasePage.class);
        BasePage.open();
        BasePage.baseTitle();
        BasePage.SearchBox();
        BasePage.SearchClick();
        BasePage.Waiit();
        SearchResultsPage SearchResultsPage = PageFactory.initElements(driver, JavaSelen.SearchResultsPage.class);
        SearchResultsPage.SearchTitle();

    }
}






