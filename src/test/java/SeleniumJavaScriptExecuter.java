import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.bidi.module.Script;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumJavaScriptExecuter {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //Syntax
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(Script,args);



        //flash

        //Drawing  the Boeder and Take Screen shots

        WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        JavascriptUtil.drawBorder(logo,driver);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\logo.png");
        FileUtils.copyFile(src,trg);
        //Getting Title of the Page

        //Click Action

        //Generate the Alert

        //Refreshing the  Page

        //scrolling th eDown and Operations

        //Zoom Page

    }
}
