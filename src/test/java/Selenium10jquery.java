import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium10jquery {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

//        selectChoiceDropdow(driver,"choice 1");

//        selectChoiceDropdow(driver,"choice 1","choice 3");
        selectChoiceDropdow(driver,"all");

    }

    public static void selectChoiceDropdow(WebDriver driver,String... value){
        List<WebElement> optionstoClick = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        if (!value[0].equalsIgnoreCase("all")){
            for (WebElement ele1: optionstoClick){
                String text = ele1.getText();
                for (String vals :value){
                    if (text.equals(vals)){
                        ele1.click();
                        break;
                    }
                }
            }
        }
        else {
            try{
                for (WebElement ele1:optionstoClick){
                    ele1.click();
                }
            }
            catch (Exception e){

            }

        }
    }
}
