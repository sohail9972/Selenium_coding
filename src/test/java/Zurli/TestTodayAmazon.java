package Zurli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTodayAmazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.in/");
        WebElement button =driver.findElement(By.xpath("//div[@id='rhf-container']//div[2]//a[@class='action-button']"));
        assert button.isDisplayed();
        button.click();


        driver.findElement(By.name("email")).sendKeys("zulri@Test.com");
        driver.findElement(By.id("continue")).click();
    }
}
