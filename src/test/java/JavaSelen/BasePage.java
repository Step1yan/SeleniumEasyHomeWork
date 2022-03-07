package JavaSelen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class BasePage extends Hooks {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findelemet;
    By SearchBoxLocator = By.cssSelector(".form-control.form-text");
    By SearchClickLocator = By.cssSelector("div.input-group>span>button");

    public void open() {
        driver.get(baseURL);
    }

    public void baseTitle() {
        String GenTitle = driver.getTitle();
        Assert.assertTrue(GenTitle.equals("Learn Selenium with Best Practices and Examples | Selenium Easy"));
        System.out.println("Title of website  " + GenTitle);
    }

    public void SearchBox() {
        driver.findElement(SearchBoxLocator).sendKeys("interview questions");

    }

    public void SearchClick() {
        driver.findElement(SearchClickLocator).click();
    }

    public void Waiit() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16l));
    }
}
