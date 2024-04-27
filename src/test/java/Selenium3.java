import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Selenium3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.meesho.com/");


        driver.navigate().to("https://www.amazon.in/");
//        driver.get("https://www.amazon.in/");

        driver.navigate().back();//back
        driver.wait(2);
        driver.navigate().forward(); //forward
        driver.wait(2);
        driver.navigate().refresh(); //refresh//reloading


    }
}
