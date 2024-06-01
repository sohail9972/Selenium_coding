import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();

        String year="2024";
        String month="December";
        String day="10";


        //By clicking on the Date picker there will be calendar
        driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
        Thread.sleep(10);

        //Selects the Month and Year
        while(true){
//        String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//
//        String arr[] = monthYear.split(" ");
        String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

        if(mon.equalsIgnoreCase(month) && yr.equals(year))
            break;
        else {
             driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        List<WebElement> alldates =driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td"));


        for (WebElement el : alldates){
            String dt=el.getText();
        if (dt.equals(day)){
            el.click();
            break;
        }
        }
    }
    }
}
