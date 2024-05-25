import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class SeleniumBrokenlinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");

       List<WebElement> elements = driver.findElements(By.tagName("a"));

       int brokenLink=0;
       for (WebElement el : elements){
           String Url = el.getAttribute("href");
           if (Url==null || Url.isEmpty()){
               System.out.println("url is empty");
               continue;
           }

           // creating URl

           URL link =new URL(Url);
           try {

               // establishment of the Connection
               HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
                httpconnect.connect();
                if (httpconnect.getResponseCode()>=400){
                    System.out.println(httpconnect.getResponseCode() + "Broken link");
                    brokenLink++;
                }else {
                    System.out.println(httpconnect.getResponseCode() + "Valid link");
                }

           } catch (Exception e) {

           }


       }
       System.out.println(brokenLink + " these are links");
       driver.quit();
    }
}
