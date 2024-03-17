package assaigment;

import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class assaigment7 extends TestAss{
    @Test
    public void Test() throws Exception{
        driver.get("https://www.amazon.com/");
       // Take Full Page Screenshot.
       TakesScreenshot amazon=(TakesScreenshot)driver;
      File amazonfile= amazon.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(amazonfile,new File("C:\\Users\\Bashair\\IdeaProjects\\assaigment\\IMAGE\\IMAGE.PNG"));
        // Take any spesific WebElement ScreenShot
       WebElement amazonimage= driver.findElement(By.tagName("i"));
     File amazonimg=  amazonimage.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(amazonimg,new File("C:\\Users\\Bashair\\IdeaProjects\\assaigment\\IMAGE\\spesificimage.PNG"));
    }
}
