import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumToolTip {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement input1 = driver.findElement(By.xpath("//input[@id='age']"));
        String tooltip = input1.getAttribute("title");
        System.out.println(tooltip);
    }
}
