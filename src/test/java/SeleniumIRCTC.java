import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumIRCTC {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//span[@class=\"ng-tns-c58-10 ui-calendar\"]//input")).click();

        String year = "2025";
        String month = "July";
        String day = "10";

        driver.findElement(By.xpath("//span[@class=\"ng-tns-c58-10 ui-calendar\"]//input")).click();
        while(true){
            String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
            String ye = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();

            if (mon.equals(month) && ye.equals(year)){
                break;
            }else {
                driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
            }

            List<WebElement> alldates = driver.findElements(By.xpath("//table//tbody//tr//td"));
            for (WebElement ele : alldates){
                String dt = ele.getText();
                if (dt.equals(day)){
                    ele.click();
                    break;
                }
            }
        }
    }
}
