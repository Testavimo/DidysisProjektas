package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Common;
import pages.vmu.CommonVmu;
import utils.Driver;

import static pages.vmu.CheckBoxDemo.clickOnTheCheckBox;

public class CheckBoxDemo {

    @BeforeTest
    public void init() {

        // Sukuriame WebDriver objektą
        Driver.initialize();

        // Atidarome puslapį
        Common.openLink("https://vmu.lt/");
        //Keiciame puslapi i Common.openLink("https://vmu.lt/?s=");

        // Uždaryti reklamą
        CommonVmu.waitForAddPopupToBeVisible();
        CommonVmu.closeAdd();
        // //*[@id="moove_gdpr_cookie_info_bar"]
    }


    @Test
    //i paskutini testa perkelt , o box'e vedant irasyti ne i tema zodi. // //*[@id="wp-block-search__input-1"]
    public void testCheckbox() {
        String expectedResult = "Success - Check box is checked";
        String actualResult;

        new CheckBoxDemo();
        actualResult = pages.vmu.CheckBoxDemo.testCheckbox();

        Assert.assertEquals(actualResult, expectedResult);
    }

    //String expectedOutput = "Rezultatų nėra." ( Laukelyje irasius netinkama forma).

    //pages.vmu.CheckBoxDemo.clickOnTheCheckBox();
    // actualOutput = pages.vmu.CheckBoxDemo.getResultText();
    //Assert.assertEquals(actualOutput, expectedOutput);


    @AfterTest
    public void quit() {
        Driver.quit();
    }

}
