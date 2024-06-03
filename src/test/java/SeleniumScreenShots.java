import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumScreenShots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();


        //Full Screen shots

        //TakeScreenShot is interface , will be declared with the Wrapped TakeScreenShots
        //WebDriver Wont hold the TakeScrenSjot interface
        //As both are the Different interface
        //These intefaces are independent of the each others

//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        File trg = new File(".\\screenshots\\homepage.png");
//        FileUtils.copyFile(src,trg);



//Capturing of the Specific Section of the Page

//        WebElement elesection = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[@role='presentation']/div[@class='navFooterVerticalRow navAccessibility']/div[1]"));
//        File src = elesection.getScreenshotAs(OutputType.FILE);
//        File trg = new File(".\\screenshots\\homepage1.png");
//        FileUtils.copyFile(src,trg);

//Capturing the Specific Section of the Tag
        WebElement eletag = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        File src = eletag.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\homepage2.png");
        FileUtils.copyFile(src,trg);


    }
}


