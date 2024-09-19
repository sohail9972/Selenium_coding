package Rakuten;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class youtubeTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/@LambdaTest/videos");
        JSONArray resultArray = new JSONArray();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@aria-label='Accept all']"))));
            driver.findElement(By.xpath("//button[@aria-label='Accept all']")).click();
        } catch (Exception e) {

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

//        scrolling down to the bottom of the page to load the videos

        JavascriptExecutor js = (JavascriptExecutor) driver;
        long scrollheight = (long) js.executeScript("return document.documentElement.scrollHeight");
        long startHeight = 0;
        do {
            startHeight = scrollheight;
            js.executeScript("window.scrollTo(0," + startHeight + ")");
            Thread.sleep(1000);
            scrollheight = (long) js.executeScript(("return document.documentElement.scrollHeight"));
        } while (startHeight != scrollheight);


//        List<WebElement> allvideos= driver.findElements(By.xpath("//*[@id='contents']//div[@id='content']"));
//        for (WebElement video:allvideos){
//            WebElement details =video.findElement(By.xpath(".//*[@id='details']"));
//
//            WebElement videoTitle = details.findElement(By.xpath(".//*[@id='video-title-link']"));
//            List<WebElement> videoMetaData = details.findElements(By.xpath(".//div[@id='metadata-line']//span"));
//
//            JSONObject videoData = new JSONObject();
//            videoData.put("video_title",videoTitle.getText());
//            videoData.put("video_views",videoMetaData.get(0).getText());
//            videoData.put("video_days",videoMetaData.get(1).getText());
//
//            resultArray.add(videoData);
//        }

        List<WebElement> allVideos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='content']")));
        for (WebElement video : allVideos) {
            try {
                WebElement details = video.findElement(By.xpath(".//*[@id='details']"));
                WebElement videoTitle = details.findElement(By.xpath(".//*[@id='video-title-link']"));
                List<WebElement> videoMetaData = details.findElements(By.xpath(".//div[@id='metadata-line']//span"));

                // Check if meta data exists before accessing
                if (videoMetaData.size() >= 2) {
                    JSONObject videoData = new JSONObject();
                    videoData.put("video_title", videoTitle.getText());
                    videoData.put("video_views", videoMetaData.get(0).getText());
                    videoData.put("video_days", videoMetaData.get(1).getText());
                    resultArray.add(videoData);
                } else {
                    System.out.println("Not enough metadata for video.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Element not found in video: " + e.getMessage());
            }
        }

//        System.out.println(resultArray);

        JSONArray newuserList = new JSONArray();
        JSONObject jsonobject;
        for (int i = 0; i < resultArray.size(); i++) {
            jsonobject = (JSONObject) resultArray.get(i);

            String id = (String) jsonobject.get("video_title");
            String pass = (String) jsonobject.get("video_views");
            String days = (String) jsonobject.get("video_days");
            newuserList.add(jsonobject);
            // Here we are putting json object into newuserList which is of JSONArray type
            try {
                FileWriter file = new FileWriter("output.csv");

                newuserList.writeJSONString(newuserList, file);
                file.close();
            } catch (Exception e) {

                e.getMessage();
            }
        }
    }
}
