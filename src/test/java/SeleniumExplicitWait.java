import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class SeleniumExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

//        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);


        //element Specific

        By elelocator = By.xpath("//h3[text()='Selenium']");
        waitForElementPresent(driver,elelocator,10).click();


//        driver.findElement(By.xpath("//h3[text()='Selenium']")).click();




    }
    //Writing Generic Method for the Explicit Method
    public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }
}
