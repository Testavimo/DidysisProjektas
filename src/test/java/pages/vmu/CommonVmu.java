package pages.vmu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utils.Driver;

import java.time.Duration;

public class CommonVmu {

    public static void waitForAddPopupToBeVisible() {
        WebElement popup = Common.findElement(By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]"));

//        Explicit wait'as (sulaukiame kol reklamos elementas bus matomas ir jį uždarome)
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(popup));

    }

    public static void closeAdd() {
        By locator = By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]");
        Common.clickElement(locator);
    }
}
