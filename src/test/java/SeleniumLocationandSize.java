import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocationandSize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();



        WebElement ele = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
   //Return the X and Y cordinates
        //Locations

        System.out.println(ele.getLocation());
        //Only X
        System.out.println(ele.getLocation().getX());
        //only Y

        System.out.println(ele.getLocation().getY());


        //By getRect Method

        System.out.println(ele.getRect().getX());
        System.out.println(ele.getRect().getY());


        //Size of the Element , gives the Dimension of th element

        System.out.println( ele.getSize());
        System.out.println(ele.getSize().getWidth());
        System.out.println(ele.getSize().getHeight());

        //Methos 2 for the Size of the Element

        System.out.println(ele.getRect().getDimension().getHeight());
        System.out.println(ele.getRect().getDimension().getWidth());

    }
}
