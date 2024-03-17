import assaigment.TestAss;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
public class assaigment5 extends TestAss {
    /*   Go to URL: http://facebook.com
     getCookies,
     addCookie,
     deleteCookieNamed,
     deleteAllCookies
*/
    @Test
    public void test(){
       driver.navigate().to("http://facebook.com");
        var coockies=driver.manage().getCookies();
        System.out.println("List of cookies");
        coockies.forEach(System.out::println);
        System.out.println("               ");
        driver.manage().addCookie(new Cookie("datr1","1234ab"));
        coockies = driver.manage().getCookies();
        System.out.println("add name of cookies");
        coockies.forEach(System.out::println);
        System.out.println("               ");
        driver.manage().deleteCookieNamed("fr");
        coockies = driver.manage().getCookies();
        System.out.println("update list: ");
        coockies.forEach(System.out::println);
        System.out.println("               ");
        driver.manage().deleteAllCookies();
        coockies = driver.manage().getCookies();
        System.out.println("deleteAllCookies");
        coockies.forEach(System.out::println);
        System.out.println("               ");
    }
}
