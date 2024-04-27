import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
    public static void main(String[] args) {

        //status of Web Element

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        //isDisplayed,isEnabled
//        WebElement searchbutton = driver.findElement(By.xpath("*//div//a[normalize-space()='View all features']"));
//        System.out.println(searchbutton.isDisplayed());
//        System.out.println(searchbutton.isEnabled());


        //isselected used for radio buttons, check Boxes and Drop down
        //returns boolean values


WebElement radiobuytton=driver.findElement(By.xpath("//li//input[@id='pollanswers-1']"));
        System.out.println(radiobuytton.isSelected());
        radiobuytton
.click();
        System.out.println(radiobuytton.isSelected());
    }
}
