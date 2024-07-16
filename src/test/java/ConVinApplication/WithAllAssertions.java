package ConVinApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class WithAllAssertions {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://convin.ai/");
        WebElement e = driver.findElement(By.xpath("//div[@class='navigation-container width']//nav[@role='navigation']//div[@class='menu-dropdown-text' and (normalize-space(text())='Products')]"));

        System.out.println(e.getText());
        Actions act = new Actions(driver);
        act.moveToElement(e).perform();
        Assert.assertEquals(e.getText(),"Products");
        List<WebElement> listProduct = driver.findElements(By.xpath("//div[@class='products-grid']//a"));


        for (WebElement ele : listProduct){
            System.out.println(ele.getText());
        }
    }
}
