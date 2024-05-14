import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Selenium13googleplacesdropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/maps");

        WebElement searchtool = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
        searchtool.clear();

        searchtool.sendKeys("Bangalore");

        String root;

        do{
            searchtool.sendKeys(Keys.ARROW_DOWN);
            root= searchtool.getAttribute("value");
            if (root.equals("Bengaluru Palace Bengaluru, Karnataka")){
                searchtool.sendKeys(Keys.ENTER);
                searchtool.click();
                break;
            }
        }while(!root.isEmpty());
    }
}
