import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseOPs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        //Creating Action Method Class to Perform the Mouse Actions
        Actions act = new Actions(driver);  //Actions class is an ability provided by Selenium for handling keyboard and mouse events.

        act.contextClick(btn).perform(); //Perform s the Clicking Operation
//        act.contextClick().build().perform(); // here it builds and Perform the Click Operation



    }
}
