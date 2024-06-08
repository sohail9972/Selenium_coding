import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class downloadFiles {
    public static void main(String[] args) {

        String location = System.getProperty("user.dir") + "\\Downloads\\";


        //Chrome
        //Step 1 : Create Hashmap

        HashMap preferences = new HashMap<>();
        preferences.put("download.default_directory",location);

        //instantiate the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]//a")).click();


    }
}
