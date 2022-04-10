package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Common;
import pages.vmu.CommonVmu;
import pages.vmu.SinglePuslapioKlase;
import utils.Driver;

public class TestasDemo {

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
        SinglePuslapioKlase.enterMessageToInputField(actualInput);
        SinglePuslapioKlase.clickShowMessageButton();
        actualOutput = SinglePuslapioKlase.getResultText();

        // Palyginame įvestą ir nuskaitytą tekstus
        Assert.assertEquals(actualInput, actualOutput);
    }

    @Test
    public void testMultipleInputFields() {

        // Aprašome kitus reikalingus elementus
        WebElement inputA = Common.findElement(By.xpath("randu elementa"));
        WebElement inputB = Common.findElement(By.xpath("randu"));
        WebElement button = Common.findElement(By.xpath("randu"));
        WebElement resultField = Common.findElement(By.xpath("randu"));

        // Įvedame reikšmes, paspaudžiame mygtuka, nuskaitome tekstą, palyginame
        // Duomenys
        String expectedOutput = "7";
        String actualOutput = null;

        // Veiksmai
        inputA.sendKeys("2");
        inputB.sendKeys("5");
        button.click();
        actualOutput = resultField.getText();

        // Palyginimas
        Assert.assertEquals(actualOutput, expectedOutput);
    }

    @AfterTest
    public void quit() { Driver.quit(); }



}
