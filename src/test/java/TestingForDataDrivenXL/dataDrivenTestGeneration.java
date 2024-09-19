package TestingForDataDrivenXL;

import ExcelsheetData.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class dataDrivenTestGeneration {
    public static void main(String[] args) {

        Xls_Reader reader = new Xls_Reader("src/test/java/DataFiles/AutoTestData.xlsx");
        String firstUserName =reader.getCellData("RegistrationDetails","userName",2);
        System.out.println(firstUserName);

        String firstUserPass =reader.getCellData("RegistrationDetails","password",2);
        System.out.println(firstUserPass);


//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://classic.crmpro.com/");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
//        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));




    }

}
