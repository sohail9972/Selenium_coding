import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumhandleFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://w3c.github.io/webdriver/#dfn-actions");

        //syntax to interact with the  frames
        driver.switchTo().frame("packagelistframe");
        driver.findElement(By.xpath("#####"));
        driver.switchTo().defaultContent();
    }
}
