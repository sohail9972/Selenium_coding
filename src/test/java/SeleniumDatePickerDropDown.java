import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumDatePickerDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='dob']")).click();

        Select month_drp= new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        month_drp.selectByVisibleText("Dec");

        Select year_drp= new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        year_drp.selectByVisibleText("1995");

        String date= "15";
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td"));
        for (WebElement el : alldates) {
            String dt = el.getText();
            if (dt.equals(date)){
                el.click();
                break;
            }
        }
    }
}
