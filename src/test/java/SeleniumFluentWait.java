import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class SeleniumFluentWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);


        driver.get("https://www.google.com/");

        driver.manage().window().maximize();



        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        WebElement fluent = mywait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//h3[text()='Selenium']"));
            }
        });
        fluent.click();
    }
}
