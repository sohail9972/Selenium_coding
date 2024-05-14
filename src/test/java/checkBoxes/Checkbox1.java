package checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox1 {
    public static void main(String[] args) {
        String text ="hiheyhello";
        int i= text.lastIndexOf("h",4);
        System.out.println(i);
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://total-qa.com/checkbox-example/");
//
////selecting individual select box
//
////driver.findElement(By.xpath("//input[@id='exp-1']")).click();
//  List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        System.out.println(list.size());
//
//  for(WebElement check : list){
//      check.click();
//
//  }
//
//  for (int i=0;i<list.size();i++){
//      list.get(i).click();
//  }
//
//  //last two check boxes
//        for (int j=list.size()-2;j<list.size();j++){
//            list.get(j).click();
//        }
//    }
//}
    }
}