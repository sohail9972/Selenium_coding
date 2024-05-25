import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

//        driver.findElement(By.linkText("Today's Deals")).click();
//        driver.findElement(By.partialLinkText("Deals")).click();

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
//        for (int i=0;i<=elements.size();i++){
//            System.out.println(elements.get(i).getText());
//
//            System.out.println(elements.get(i).getAttribute("href"));
//        }

        for (WebElement ele:elements){
            System.out.println(ele.getText());
            System.out.println(ele.getAttribute("href"));
        }
    }
}
