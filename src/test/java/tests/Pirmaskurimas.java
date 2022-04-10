package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pirmaskurimas {


 //?   @BeforeTest DRIVERIOSUKURIMAS; PuslapioAtidarymas; popup uzdarymas
    @Test

//sukuriame webDriver objekta ir atidarome puslapi
    public void testChrome() {
        WebDriverManager.chromedriver().driverVersion("100.0.4896.75").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://vmu.lt/");

//        @AfterTest atsiranda public void quitz() { Driver.quit();}


        driver.quit();

 // aprasome reikalingus elementus (reklamos)
 // WebElement popup = driver.findElement(By.xpath("randu elementa")
 // WebElement popupCloseButton = driver.findElement(By.xpath()

// sulaukiame kol reklamos elementas bus matomas ir ji uzdarome (BD explicit wait'as)
// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
// wait.until(ExpectedConditions.visibility0f(popup));
//popupCloseButton.click();

//Aprasome kitus reikalingus elementus
//WebElement input = driver.findElement(By.xpath("...")
//WebElement button = driver.findElement(By.xpath(''')
//WebElement resultField = driver.findElement(By.xpath("''')

// Ivedame reiksme,paspaudziame mygtuka,nuskaitome teksta
//String actualInput = "Labas";
//?cia jau kitam lektoriaus lape buvo: String actualOutput = null;
//input.sendKeys(actualInput);
//button.click();
//String expectedInput = resultField.getText();

//?cia kitam lektoriaus lape (2paskaita 2is3 33min)
//? Veiksmai
//?input.sendKeys(actualInput);
//? button.click();
//? actualOutput = resultField.getText();



//Palyginame ivesta ir nuskaityta tekstus
//Assert.assertEquals(actualInput, expectedInput);
//?kitam lektoriaus lape:
//?Assert.assertEquals(actualInput, actualOutput);

// Uzdarome narsykle
//driver.quit();
//}




        }

}
