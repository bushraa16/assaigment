package assaigment;

import assaigment.TestAss;
import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class assaigment2  extends TestAss {
    //Go to URL: https://the-internet.herokuapp.com/windows
//Verify the text: “Opening a new window”
//Verify the title of the page is “The Internet”
//Click on the “Click Here” button
//Verify the new window title is “New Window”
//Go back to the previous window and then verify the title: “The Internet”
    @Test
    public void test(){
        driver.navigate().to(" https://the-internet.herokuapp.com/windows");
        WebElement opening=driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]"));
        String tax=opening.getText();
        Assertions.assertEquals("Opening a new window", tax);
        System.out.println("Opening Text: " + tax);
        //Verify the title of the page is “The Internet”
        String title=driver.getTitle();
        Assertions.assertEquals("The Internet", title);
        System.out.println("title of the page is: " + title);
        // Click on the “Click Here” button
        By clickbutton=By.xpath("//a[contains(@href,'new')]");
        driver.findElement(clickbutton).click();
        // Verify the new window title is "New Window"
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        Assertions. assertEquals("New Window", driver.getTitle());

        // Go back to the previous window and verify the title: "The Internet"
        driver.switchTo().window(mainWindowHandle);
        Assertions. assertEquals("The Internet", driver.getTitle());
    }
}