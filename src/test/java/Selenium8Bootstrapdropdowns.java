import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium8Bootstrapdropdowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");

        driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
        List<WebElement>  number =  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));

        System.out.println(number.size());

    for (WebElement ele : number){
        if (ele.getText().equals("Accounts")){
            ele.click();
            break;
        }
    }

    driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']"));
    List<WebElement> elements =  driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));

        System.out.println(elements.size());
    for (WebElement product:elements){
        if (product.getText().equals("Salary Accounts")){
            product.click();
            break;
        }
    }

    }
}
