import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static base.Basetests.driver;

public class Selenium6 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
//


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

    //Dropdown operations
        //selectByVisibleText():

        WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

        Select countryele = new Select(country);
        //with select option

//        countryele.selectByVisibleText("Denmark");
//        countryele.selectByValue("ALA");
//        countryele.selectByIndex(5);


    //without using the select option

        List<WebElement> options=countryele.getOptions();
        for (WebElement ele :options){
//        System.out.println(ele.getText());

        if (ele.getText().equals("Cuba")){
            ele.click();
            break;
            }
        }

    }
}
