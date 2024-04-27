import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com/sohail9972");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        //reutns the HTML Page
        System.out.println(driver.getPageSource());



        //using webdriver manager

//        WebDriverManager.chromedriver().setup();
    }
}
