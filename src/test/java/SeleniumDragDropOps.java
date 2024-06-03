import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragDropOps {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(" http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement src = driver.findElement(By.id("box6"));
        WebElement dst = driver.findElement(By.id("box106"));

        Actions  act = new Actions(driver);
        act.dragAndDrop(src,dst).perform();

    }
}
