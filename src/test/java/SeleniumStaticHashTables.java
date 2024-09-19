import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStaticHashTables {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/tables");
        driver.manage().window().maximize();

//finding the Rows in the Table
        int rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
        System.out.println(rows);
//finding Columns
        int colums = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
        System.out.println(colums);

        //retrive the Particular Element
        String data = driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[1]")).getText();
        System.out.println(data);

        //retriving all the Table data

//        for (int r=1;r<=rows;r++){
//            for (int c=1;c<=colums;c++){
//                String data_all = driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td["+c+"]")).getText();
//                System.out.print(data_all + "   ");
//            }
//            System.out.println();
//        }

        // Printing the data based on the Condition
        for (int r=1;r<rows;r++){
            String data_specifi_row = driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td[1]")).getText();
            if (data_specifi_row.equals("Doe")){
                String data_firstName = driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td[2]")).getText();
                String data_mailId = driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td[3]")).getText();
                System.out.println(data_specifi_row + "   " + data_firstName + "   " + data_mailId);
            }
        }
        driver.quit();
    }
}
