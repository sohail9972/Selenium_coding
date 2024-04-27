import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium7mulitipleDropdowns {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        WebElement drop1 = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
      selectOptionDroDown(drop1,"4");


      WebElement drop2 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        selectOptionDroDown(drop2,"April");
        WebElement drop3 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        selectOptionDroDown(drop3,"2020");
    }

    public static void selectOptionDroDown(WebElement ele,String value){
        Select dropingelement = new Select(ele);
        List<WebElement> optionlist = dropingelement.getOptions();

        for (WebElement element : optionlist){
            if (element.getText().equals(value)){
                element.click();
                break;
            }
        }
    }
}
