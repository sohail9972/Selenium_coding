import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumPermissionPopUp {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.redbus.in/");

    }
}
