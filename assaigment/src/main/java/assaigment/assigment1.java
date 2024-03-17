package assaigment;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assigment1 extends TestAss {
    @Test
    public void test(){
        //Go to URL: https://api.jquery.com/dblclick/
        driver.navigate().to(" https://api.jquery.com/dblclick/");
        //Double click on the blue square at the bottom of the page and then write the changed color.
      By iframe = By.tagName("iframe");
      WebElement ifram=driver.findElement(iframe);
      driver.switchTo().frame(ifram);
       By square=By.tagName("div");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(square)).doubleClick().perform();
        driver.switchTo().defaultContent();
        //Go top of the page and sendKeys "Thanks to JavascriptExecutor"
       By search=By.name("s");
        driver.findElement(search).sendKeys("Thanks to JavascriptExecutor"+ Keys.RETURN);
//Go to the bottom of the page and click the book, name"jQuery in Action"
    By book=By.xpath("//img[contains(@alt,'jQuery in Action')]");
      driver.findElement(book).click();




    }





}
