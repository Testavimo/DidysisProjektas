package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Common;
import pages.vmu.CommonVmu;
import utils.Driver;

public class SingleFormDemoTest {

    @BeforeTest
    public void init() {

        // Sukuriame WebDriver objektą
        Driver.initialize();

        // Atidarome puslapį
        Common.openLink("https://vmu.lt/");

        // Uždaryti reklamą
        CommonVmu.waitForAddPopupToBeVisible();
        CommonVmu.closeAdd();
    }

    @Test
    public void TestSingleInputField() {

        // Aprasome kitus reikalingus elementus
//        WebElement input = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
//        WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button/svg"));
//        WebElement resultField = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p/strong"));


        // Ivedame reiksme, paspaudziame mygtuka, nuskaitome teksta, palyginame
        //Duomenys
        String actualInput = "Labas";
        String actualOutput = null;

        //Veiksmai
        pages.vmu.SingleFormDemoTest.enterMessageToInputField(actualInput);
        pages.vmu.SingleFormDemoTest.clickShowMessageButton();
        actualOutput = pages.vmu.SingleFormDemoTest.getResultText();

        // Palyginame įvestą ir nuskaitytą tekstus
        Assert.assertEquals(actualInput, actualOutput);
    }

    @Test
    public void testMultipleInputFields() {

        // Aprašome kitus reikalingus elementus
        // https://vmu.lt/?s= Paieskos laukelyje ivedu netinkama reiksme "Labas"
        WebElement inputA = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p/strong"));

        // https://vmu.lt/?s= Paieskos laukelyje ivedu tinkama reiksme "Miškas"
        WebElement inputB = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p"));

//      Click Button Search
        WebElement button = Common.findElement(By.xpath("//*[@id=\"primary\"]/div/div[2]/form/div[1]/button"));


        WebElement checkbox = Common.findElement(By.xpath("//*[@id=\"wp-block-search__input-1\"]"));
        Common.findElement(By.xpath("//*[@id=\"primary\"]/div/p"));

    }

    @AfterTest
    public void quit() {
        Driver.quit();
    }


}
