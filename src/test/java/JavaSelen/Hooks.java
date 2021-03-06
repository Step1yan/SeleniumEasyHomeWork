package JavaSelen;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks{
    public ChromeDriver driver;
    String baseURL = "https://www.seleniumeasy.com/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Open browser.");
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        System.out.println("Close browser.");
        driver.quit();
    }
}
