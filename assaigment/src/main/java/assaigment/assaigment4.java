package assaigment;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;

public class assaigment4 extends TestAss {
//( This task should be managed with keyboard actions )
// go to https://www.google.com/
// search for "Scroll Methods" by using an Actions object
    @Test
    public void test(){
    driver.navigate().to(" https://www.google.com/");
    Actions actions=new Actions(driver)
            .scrollToElement(driver.findElement(By.id("APjFqb")))
            .click(driver.findElement(By.id("APjFqb")));
    actions.keyDown(Keys.SHIFT);
    actions.sendKeys("s");
    actions.keyUp(Keys.SHIFT);
    actions.sendKeys("croll");
    actions.keyDown(Keys.SPACE);
    actions.keyUp(Keys.SPACE);
    actions.keyDown(Keys.SHIFT);
    actions.sendKeys("M");
    actions.keyUp(Keys.SHIFT);
    actions.sendKeys("ethods");
    actions.sendKeys(Keys.ENTER);
    actions.perform();
}
}
