package pages.vmu;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Common;

public class CheckBoxDemo {

    public static void clickOnTheCheckBox() {
        By locator = By.xpath("//*[@id=\"wp-block-search__input-1\"]");
        Common.clickElement(locator);
    }

    public static String getResultText() {
        By locator = By.xpath("//*[@id=\"primary\"]/div/p/strong");
        return Common.getText(locator);
    }

    //

    public static class testCheckbox {
        By locator = By.xpath("*[@id=\"wp-block-search__input-1\"]");
        String expectedOutput = "Rezultatų nėra.";
        String actualOutput = null;
    }

    public static String testCheckbox() {

        pages.vmu.CheckBoxDemo.clickOnTheCheckBox(); //*[@id="wp-block-search__input-1"]
        String actualOutput = pages.vmu.CheckBoxDemo.getResultText();
        String expectedOutput = null;
        Assert.assertEquals(actualOutput, expectedOutput);
        //Parasius bet ka ne i tema - turime gauti - Rezultatų nėra.

        return actualOutput;
    }

    public static void clickShowMessageButton() {
//      WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
        By locator = By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg");
        Common.clickElement(locator);
    }


    public static String clickShowMessage() {
        By locator = By.xpath("//*[@id=\"primary\"]/div/p/strong");
        return Common.getText(locator);
    }
}