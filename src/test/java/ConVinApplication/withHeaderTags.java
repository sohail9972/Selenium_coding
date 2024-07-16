package ConVinApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class withHeaderTags {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://convin.ai/");
       List<WebElement> element = driver.findElements(By.xpath("//div[@class='navigation-container width']//nav[@role='navigation']//div[@class='menu-dropdown-text']"));
       for (WebElement el : element){
           System.out.println(el.getText());
       }

    }
}
