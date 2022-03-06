package JavaSelen;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class FirstTest extends Hooks {

    @Test
    public void firstTest() {

        String GenTitle = driver.getTitle();
        Assert.assertTrue(GenTitle.equals("Learn Selenium with Best Practices and Examples | Selenium Easy"));
        System.out.println("Title of website  " + GenTitle);
        WebElement textInput = driver.findElement(By.cssSelector(".form-control.form-text"));
        textInput.sendKeys("interview questions");
        WebElement Searchbutton = driver.findElement(By.cssSelector("div.input-group>span>button"));
        Searchbutton.click();
        List<WebElement> title = new ArrayList<>(driver.findElements(By.cssSelector(".container-fluid ol>li>h3")));
        String results;

        for (WebElement value : title) {
            System.out.println("Results--------  " + value.getText());
            results = value.getText();
            Assert.assertTrue(results.contains("interview questions"));
        }
    }
}
//





