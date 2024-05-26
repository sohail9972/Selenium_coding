import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumDynamicHashTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.schooldigger.com/go/CO/schoolrank.aspx");
        driver.manage().window().maximize();

        String value=driver.findElement(By.xpath("//div[@id='tabSchooList_info']")).getText();
        System.out.println(value);


//        text= Showing 1 to 10 of 933 schools
//        text.indexOf("(")
//        text.indexOf("Pages")
//        text.substring(text.indexOf("text.indexOf("(")+1, text.indexOf("Pages")-1)" //it include the Starting index of the given string an dEnding Index of it to
        // to make it s Substring of the given String

//Useage
        int total_schools_pages=Integer.valueOf(value.substring(value.indexOf("9") , value.indexOf("schools")-1));
        System.out.println(total_schools_pages);

        for (int page=1;page<=94;page++){
            String page_no=Integer.toString(page);

           WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+page_no+"']"));
            System.out.println(active_page);
            active_page.click();

            int total_rows=driver.findElements(By.xpath("//table[@id='tabSchooList']//tbody//tr")).size();
            System.out.println(total_rows);


            for(int r=1;r<=total_rows;r++) {
                String oreder_Id = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover]//tbody//tr[" + r + "]//td[2]")).getText();
                String cuwstomer_number = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover]//tbody//tr[" + r + "]//td[3]")).getText();
                String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover]//tbody//tr[" + r + "]//td[4]")).getText();

                if (status.equals("Pending")) {

                    System.out.println(oreder_Id + " " + cuwstomer_number + " " + status);
                }
            }
            driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+page_no+"']")).click();

        }

    }
}
