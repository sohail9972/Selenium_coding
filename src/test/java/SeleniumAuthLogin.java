import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumAuthLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://the-internet.herokuapp.com/basic_auth");

    //syntax to pass the Username and Password

   //     https://admin:admin@the-internet.herokuapp.com/basic_auth
   // https://user:password@URL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
