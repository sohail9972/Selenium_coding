import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium00Oracle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.oracle.com/in/");
        driver.manage().window().maximize();


        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Products']"));
        button.click();
        System.out.println(button);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id='cloud-infrastructure']//li"));
        System.out.println(list.size());

    }
}
