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

public class PracticeBrokenLinkscode {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");


        List<WebElement> elements = driver.findElements(By.tagName("a"));

        int brokenLinks = 0;
        for (WebElement ele : elements){

            String url = ele.getAttribute("href");
            if (url==null || url.isEmpty()){
                System.out.println("empty url");
                continue;
            }

            URL links= new URL(url);
            try {
                HttpURLConnection httpconnect = (HttpURLConnection) links.openConnection();
                httpconnect.connect();
                if (httpconnect.getResponseCode()>=400){
                    System.out.println(httpconnect.getResponseCode() + " Invalid codes");
                    brokenLinks++;
                }else {
                    System.out.println(httpconnect.getResponseCode() + " Valid Codes");
                }
            } catch (Exception e) {

            }



        }
        System.out.println(brokenLinks);
        driver.quit();


    }
}
