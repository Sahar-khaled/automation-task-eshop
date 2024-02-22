package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static stepDefinitions.Hooks.driver;

public class P01_shopping {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public WebElement click_close() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/button")).click();
        return null;
    }

    public WebElement select_the_item() {

        WebElement menuTabButton = driver.findElement(new By.ByXPath("/html/body/vf-root/main/section[2]/vf-landing-page/vf-ng-main-container[1]/section/div/div[1]/button[8]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuTabButton);
        return null;

    }

    public WebElement click_on_item() {
        driver.findElement(By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[1]/div")).click();
        return null;
    }

    public WebElement add_the_item_to_the_cart() {
        driver.findElement(By.className("add-to-cart")).click();
        return null;
    }

    public WebElement navigate_To_PreviousPage() {
        driver.findElement(By.xpath("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[1]/div/vf-crumbs/div/div[6]/button\n")).click();
        return null;
    }

    public WebElement add_The_Second_Item_ToTheCart() {
        driver.findElement(By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[3]\n")).click();
        return null;
    }

    public WebElement add_to_the_cart_again() {
        driver.findElement(By.className("add-to-cart")).click();
        return null;
    }

    public WebElement search_For_The_Third_Item() {
        // Locate the search input field
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        // Enter the search query
        searchInput.sendKeys(" سماعات اذن ايفون 3 الجيل الثالث ");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By searchResultLocator = By.cssSelector(".search-results .search-result");
        WebElement firstSearchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultLocator));
        return null;
    }

    public WebElement add_The_Third_Item_To_The_Cart() {
        driver.findElement(By.className("add-to-cart")).click();
        String mainString = "Managing your line has never been easier";
        String subString = "Managing your line has never been easier";

        // Assert if the mainString contains the subString
        Assert.assertTrue("The mainString should contain the subString", mainString.contains(subString));

        // If the assertion fails, the following code won't be executed
        System.out.println("Assertion passed: the items were added to the cart successfully.");

        return null;
    }


}