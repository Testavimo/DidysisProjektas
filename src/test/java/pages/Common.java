package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;


public class Common {

    public static void openLink(String url) {
        Driver.driver.get(url);
    }


    public static WebElement findElement(By locator) {
        return Driver.driver.findElement(locator);
    }


    public static void clickElement(By locator) {
        findElement(locator).click();
    }

    public static void sendKeys(By locator, String keys) {
        findElement(locator).sendKeys(keys);
    }


    //public static void openLink() { }

    public static String getText(By locator) {
        return findElement(locator).getText();
    }
}


