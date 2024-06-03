import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumOpeninNewTab {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();


        String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Cards")).sendKeys(tab);

    }
}
