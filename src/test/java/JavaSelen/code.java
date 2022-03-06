package JavaSelen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;


public class code {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/");
        driver.manage().window().maximize();
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

        driver.quit();

    }

}
