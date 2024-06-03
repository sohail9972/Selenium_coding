import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions act =new Actions(driver);

        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.SHIFT).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.INSERT).perform();


        //Combination of the Keys

    }
}
