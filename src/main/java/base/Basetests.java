package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basetests {
    public static WebDriver driver;
    public Properties prop;

    public WebDriver init_driver(Properties prop){
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url1"));
        //https://headsupfortails.com/
        return driver;
    }

    public void init_prop(){
       prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("src/test/java/config/config.properties");
            try {
                prop.load(ip);
            } catch (IOException e) {
               e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
//    public ExtentSparkReporter sparkReporter;
//    public ExtentReports extent;
//    public ExtentTest logger;

//    @BeforeTest
//    public void beforeTestMethod(){
//    sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports" + File.separator + "Testing");
//    extent  = new ExtentReports();
//    extent.attachReporter(sparkReporter);
//    sparkReporter.config().setTheme(Theme.DARK);
//    extent.setSystemInfo("HostName","RHELB");
//    extent.setSystemInfo("UserName","root");
//    sparkReporter.config().setDocumentTitle("Automation Report");
//    sparkReporter.config().setReportName("Automation Tests Results By Testing");
//    }
//    @BeforeMethod
//    @AfterMethod
//    @AfterTest
}
