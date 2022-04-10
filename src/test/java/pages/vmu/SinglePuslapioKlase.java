package pages.vmu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Common;

public class SinglePuslapioKlase {

//   WebElement input = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
//   WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
//   WebElement resultField = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p/strong"));

   public static void enterMessageToInputField(String mesage) {
      By locator = By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
      Common.sendKeys(locator, message);
//      input.sendKeys(message);
//      WebElement input = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
   }

   public static void clickShowMessageButton () {
//      WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
      By locator = By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
      Common.clickElement(locator);
   }

   public static String getResultText() {
      By locator = By.xpath("//*[@id=\"primary\"]/div/p/strong"));
      return Common.getText(locator);
   }
}
