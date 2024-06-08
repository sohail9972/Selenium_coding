import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class uploadFilesSelenium {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/FileUpload.html");

//        driver.findElement(By.xpath("//div[@data-upload-options='{\"action\":\"https://formstone.it/demo/_extra/upload-target.php\"}']//div[@class='fs-upload-target'][normalize-space()='Drag and drop files or click to select']")).click();
//
//
//        driver.findElement(By.xpath("")).sendKeys("");

//        WebElement button =driver.findElement(By.xpath("//input[@id='input-4']"))
//        JavaScriptExecutor js = (JavaScriptExecutor) driver;
//        js.executeScript("arguments[0].click()",button);

        //using Robot Class Method
//        Step 1 - Copy the Path
//        STep 2 paste the Path using CNTRL +  V
        //Enter Button

//Creating Robot instances
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\Users\\Sohail\\Downloads");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        //CNTRL + V


        rb.keyPress(KeyEvent.VK_CONTROL); // Press on Enter Key
        rb.keyPress(KeyEvent.VK_V); //Presee V

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);




    }
}
