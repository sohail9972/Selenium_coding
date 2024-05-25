import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumIframes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        WebElement outerelementframe = driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
    driver.switchTo().frame(outerelementframe);

    WebElement innerFrame= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
    driver.switchTo().frame(innerFrame);

    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");

    }
}
