import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/menu/");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        WebElement subEle = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
        WebElement triEle = driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));

        Actions act = new Actions(driver);
        act.moveToElement(ele).moveToElement(subEle).perform();
    }
}
