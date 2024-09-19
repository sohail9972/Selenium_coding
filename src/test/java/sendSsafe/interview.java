package sendSsafe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.time.Duration;
import java.util.List;

public class interview {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.meesho.com/clocks/pl/3kh");
        driver.manage().window().maximize();

        try{
            Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Kitchen']"))).click().perform();
//        act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Clocks']"))).click().perform();
//
            act.moveToElement(driver.findElement(By.xpath("//div[@value='Relevance']"))).click().perform();
//            act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Ratings']"))).click().perform();
            Thread.sleep(Duration.ofSeconds(10));
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sc-ftTHYK gDMntJ']//a"));
            for (WebElement ele : elements){
                System.out.println(ele.getText());
                if (ele.getText().equals("Ratings")){
                   ele.click();
//                    WebElement button =driver.findElement(By.xpath("//a[normalize-space()='Ratings']"));
//                    act.moveToElement(driver.findElement(By.xpath("//div[@class='sc-cOxWqc bLdIZq']//span[normalize-space()='Ratings']"))).click().perform();
//                   WebElement button = (WebElement) act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Ratings']")));
//                    button.click();
                }
            }
        }catch (Exception e){
            System.out.println("issue with the Page");
            e.printStackTrace();
        }

//        act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Kitchen']"))).click().perform();
//        act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Clocks']"))).click().perform();
//

//        act.moveToElement(driver.findElement(By.xpath("//div[@class='sc-dkrFOg ggMaSF']//div//img[@alt='Graceful Digital Clocks']"))).click().perform();
//        act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Graceful Digital Clocks']"))).click().perform();

//
//        List<WebElement> elev= driver.findElements(By.xpath("//div[contains(@class,'sc-dkrFOg ggMaSF')]//div//a//p"));
//        System.out.println(elev);
//        driver.findElement(By.xpath("//div[@value='Relevance']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Ratings']")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Graceful Digital Clocks']")).click();

    }
}
