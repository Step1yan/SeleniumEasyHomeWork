package JavaSelen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    By SearchResultsTitle = By.cssSelector(".container-fluid ol>li>h3");

    public void SearchTitle() {
        List<WebElement> title = new ArrayList<>(driver.findElements(SearchResultsTitle));
        String results;

        for (WebElement value : title) {
            System.out.println("Results--------  " + value.getText());
            results = value.getText();
            Assert.assertTrue(results.contains("interview questions"));
        }
    }
}
