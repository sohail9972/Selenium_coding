import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();


        //Returns the set of the Cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        //Hoe to get the Cookies fro Browser

        for (Cookie coo : cookies){
            System.out.println(coo.getName() + " " + coo.getValue());
        }

        //Adding the Cookie to Browser

        Cookie cookieObj = new Cookie("Mycookies122343223","9867453");
        driver.manage().addCookie(cookieObj);

        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        //delete Cookie

        driver.manage().deleteCookie(cookieObj);
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

//delete all Cookies

        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

    }
}
