import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium12AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[@role='presentation']//span"));
        System.out.println(list.size());

        for (WebElement option : list){
            System.out.println(option.getText());
            if(option.getText().equals("selenium webdriver")){
                option.click();
                break;
            }
        }

    }
}
