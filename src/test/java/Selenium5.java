import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement emailinput = driver.findElement(By.id("Email"));
        emailinput.clear();
        emailinput.sendKeys("admin@gmail.com");

    //capturing value from inout field
        System.out.println(emailinput.getAttribute("value"));
       //returns the innner text of the input field
        System.out.println(emailinput.getText());


        //login button
        WebElement loginbutton=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        System.out.println(loginbutton.getText());
        System.out.println(loginbutton.getAttribute("type"));

    //title text
        String title = driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
        System.out.println(title);

    }
}
