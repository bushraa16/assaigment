package assaigment;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.LogManager;

public abstract class TestAss {
    protected WebDriver driver ;
    protected Wait<WebDriver>wait;

    @BeforeEach
    public void BeforeEach(){
        FirefoxOptions chromeOptions=new FirefoxOptions();
        driver=new FirefoxDriver(chromeOptions);
       wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }}
//    @AfterEach
//    public void AfterEach(){
//        driver.quit();
//    }
//}
