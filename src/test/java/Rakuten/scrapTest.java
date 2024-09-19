package Rakuten;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.time.Duration;
import java.util.List;

public class scrapTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Navigate to Lambdatest e-commerce website
        JSONArray scrapedData = new JSONArray();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        //maximize the browser window
        driver.manage().window().maximize();


        //wait for element to be visible and then click on it
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'Shop by Category')]")));
        driver.findElement(By.xpath("//a[contains(.,'Shop by Category')]")).click();

        //wait for phones, tablets category element to be visible and then click on it
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Phone, Tablets & Ipod')]")));
        driver.findElement(By.xpath("//span[contains(.,'Phone, Tablets & Ipod')]")).click();


        //wait for all products to load on the screen
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='entry_212408']//div[@class='row']")));


        //fetch and store the reference to all products parent web element
        //nested locators 1
        WebElement allProducts = driver.findElement(By.xpath("//*[@id='entry_212408']//div[@class='row']"));


        //use the parent web element to fetch list of web elements for each individual product
        //nested locators 2
        List<WebElement> productList = allProducts.findElements(By.xpath(".//div[contains(@class,'product-layout product-grid no-desc')]"));


        //traverse the list of product web elements to scrap the required data
        for (WebElement product : productList) {
            WebElement detail = product.findElement(By.xpath(".//a[@class='text-ellipsis-2']"));
            WebElement price = product.findElement(By.xpath(".//span[@class='price-new']"));


            //store product image link, name and price in a json object
            JSONObject productMetaData = new JSONObject();
//            productMetaData.put("product_image", detail.getAttribute("href"));
            productMetaData.put("product_name", detail.getText());
            productMetaData.put("product_price", price.getText());

            scrapedData.add(productMetaData);

            //add each product detail to json array to aggregate the data at one location
//                scrapedData.put(productMetaData);
        }

        JSONArray newuserList = new JSONArray();
        JSONObject jsonobject;
        for (int i = 0; i < scrapedData.size(); i++) {
            jsonobject = (JSONObject) scrapedData.get(i);

            String id = (String) jsonobject.get("product_name");
            String pass = (String) jsonobject.get("product_price");
//            String days = (String) jsonobject.get("video_days");
            newuserList.add(jsonobject);
            // Here we are putting json object into newuserList which is of JSONArray type
            try {
                FileWriter file = new FileWriter("src/test/java/Rakuten/scrapTest.csv");

                newuserList.writeJSONString(newuserList, file);
                file.close();
            } catch (Exception e) {

                e.getMessage();
            }
        }
        //print all the scraped products data on console
//            System.out.println(scrapedData);
    }

}
