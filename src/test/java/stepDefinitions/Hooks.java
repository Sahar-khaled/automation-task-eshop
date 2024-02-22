package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = new FirefoxDriver();

    @Before
    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("webdriver.chrome.driver", "E:\\task\\src\\browsers\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://eshop.vodafone.com.eg/ar/");
    }

    @After
    public void QuitBrowser() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

}
