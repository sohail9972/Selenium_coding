import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium9Genreic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");


        driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
        List<WebElement> number =  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
        selectBootSrapdropdown(number,"Accounts");

        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']"));
        List<WebElement> elements =  driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
        selectBootSrapdropdown(elements,"Salary Accounts");

    }

    public static void selectBootSrapdropdown(List<WebElement> option, String value){
        for (WebElement ele : option){
            if (ele.getText().equals(value)){
                ele.click();
                break;
            }
        }
    }
}
