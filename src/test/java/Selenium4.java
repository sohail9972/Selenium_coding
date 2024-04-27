import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

//findelement() -> returns single Element
        //scenario 1
       WebElement searchbox = driver.findElement(By.xpath(" //input[@id='small-searchterms']"));
       searchbox.sendKeys("xyz");

       //

        WebElement searchboxmulti = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(searchboxmulti.getText());

        //3 exception when the elements doesnt macth

        //findElements()

        //first scenarion
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(links.size());

        //second  scenraio
        List<WebElement>logosearch = driver.findElements(By.xpath("//input[@id='small-searchterms']"));
        System.out.println(logosearch.size());

        //iteratin on the list of Elements
        List<WebElement> links2 = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(links.size());
        for (WebElement ele : links2){
            System.out.println(ele.getText());
        }
    }
}
