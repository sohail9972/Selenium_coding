import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;

public class SeleniumSliders {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        WebElement min_ele = driver.findElement(By.xpath("//span[1]"));

        System.out.println(min_ele.getLocation()); //(612, 250)
        System.out.println(min_ele.getSize()); //(21, 21)


        Actions act = new Actions(driver);
        act.dragAndDropBy(min_ele,100,0).perform();

        System.out.println(min_ele.getLocation());
        System.out.println(min_ele.getSize());

        WebElement max_ele = driver.findElement(By.xpath("//span[2]"));
        act.dragAndDropBy(max_ele,-100,0).perform();

        System.out.println(max_ele.getLocation());
        System.out.println(max_ele.getSize());


    }
}
