import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyboardaction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        //Performing the Combination Keys on Keyboard Operations

        input1.sendKeys("Hello World");

        Actions act = new Actions(driver);
        //Cntrl + A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //cvontrol + c
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //tab + Shift to input 2 box
        act.sendKeys(Keys.TAB);
        act.perform();

        //cntrl + V
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        // compare the Texts
        if (input1.getAttribute("value").equals(input2.getAttribute("value"))){
            System.out.println("Text Copied");
        }else {
            System.out.println("text Not copied ");
        }

    }
}
