import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class SeleniumFileDownload {
    public static void main(String[] args) {

        String Location  = System.getProperty("user.dir")+ "\\Downloads";


        //Chrome
        HashMap preference = new HashMap();
        preference.put("download.default_directory",Location);

        ChromeOptions options =new ChromeOptions();
        options.setExperimentalOption("prefs",preference);


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://file-examples.com/index.php/sample-documents-download/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//tbody/tr[1]//td[3]//a[1]")).click();


    }
}
