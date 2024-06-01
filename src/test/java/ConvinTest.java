import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ConvinTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("122334");
        driver.findElement(By.xpath("//button[@name='login']")).click();
       WebElement buttonVali=driver.findElement(By.xpath("//button[@name='login']"));
       String actual = driver.getTitle();
       String expected = "Log in to Facebook";
       Assert.assertEquals(actual,expected);
//       if(buttonVali.isDisplayed()){
//           buttonVali.click();
//       }else {
//           assert buttonVali.isDisplayed();
//       }
//       Thread.sleep(10);
//       assert driver.findElement(By.xpath("//button[@name='login']")).isSelected()==true;

    }
}
