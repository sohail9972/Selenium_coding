import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Selenium11SortinglementsofDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.twoplugs.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();

        WebElement dropdownele = driver.findElement(By.name("category_id"));
        Select dropdownselect = new Select(dropdownele);

        List<WebElement> options = dropdownselect.getOptions();

        ArrayList originallist = new ArrayList<>();
        ArrayList temparoryList= new ArrayList<>();

        for (WebElement eachoption : options){
            originallist.add(eachoption);
            temparoryList.add(eachoption);
        }


        System.out.println(originallist);
        System.out.println(temparoryList);


        Collections.sort(temparoryList);

        System.out.println(originallist);
        System.out.println(temparoryList);

        if (originallist.equals(temparoryList)){
            System.out.println("both list are sorted....");
        }
        else {
            System.out.println("not sorted....");
        }
    }
}
