package pages.vmu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Common;

import java.time.Duration;

public class SingleFormDemoTest {

    WebElement input = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
    WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
    WebElement resultField = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p/strong"));
    WebElement Add = Common.findElement(By.xpath("\"//*[@id=\\\"moove_gdpr_cookie_info_bar\\\"]"));


    public static void closeAdd() {
        By locator = By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]");
        Common.clickElement(locator);
    }


    public static void enterMessageToInputField(String mesage) {
        By locator = By.xpath("//*[@id=\"wp-block-search__input-1\"]");
        String message = null;
        Common.sendKeys(locator, message);
//      input.sendKeys(message);
//      WebElement input = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
    }

    public static void clickShowMessageButton() {
//      WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
        By locator = By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg");
        Common.clickElement(locator);
    }

    public static String getResultText() {
        By locator = By.xpath("//*[@id=\"primary\"]/div/p/strong");
        return Common.getText(locator);
    }


}
