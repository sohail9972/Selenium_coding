package WebScrappng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class AmzonProductPrice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

       List<WebElement> namesOfMobiles = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')]"));
       List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));
        for (WebElement maxPrice : Prices){
            Prices.toArray();
            int maxVal = Integer.MIN_VALUE;
            if(maxPrice.getText().equals(maxVal)){
                System.out.println(maxPrice.getText());
            }
        }
    }
}

