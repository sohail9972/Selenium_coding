import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMultipleURLintwodifferentTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
        //open in the New Tab
//        driver.switchTo().newWindow(WindowType.TAB);

        //Opeinign in the New window
driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh");

//        driver.manage().window().maximize();


    }
}
