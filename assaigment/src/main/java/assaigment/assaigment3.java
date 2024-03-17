package assaigment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class assaigment3 extends TestAss {
     /*
Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.
*/

    @Test
    public void test(){
        // Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
        // Drag and drop the BANK button to the Account section in DEBIT SIDE
        WebElement Bankbutton= driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
        WebElement DEITBUTTON1= driver.findElement(By.id("shoppingCart1"));
        Actions action=new Actions(driver);
        action.dragAndDrop(Bankbutton,DEITBUTTON1).build().perform();
        WebElement SALESbutton= driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement CREDIT= driver.findElement(By.id("shoppingCart3"));
        action.dragAndDrop(SALESbutton,CREDIT).build().perform();
        WebElement FIVEbutton2= driver.findElement(By.xpath("(//li[@id ='fourth'])[2]"));
        WebElement DEBITBUTTON3= driver.findElement(By.xpath("//ol[contains(@id,'amt7')]"));
        action.dragAndDrop(FIVEbutton2,DEBITBUTTON3).build().perform();
        WebElement FIVEbutton3= driver.findElement(By.xpath("(//li[@id ='fourth'])[2]"));
        WebElement DEBITBUTTON4= driver.findElement(By.xpath("//ol[contains(@id,'amt8')]"));
        action.dragAndDrop(FIVEbutton3,DEBITBUTTON4).build().perform();
        WebElement perfectText = driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
       Assertions.assertEquals("Perfect!", perfectText.getText());
    }
}
