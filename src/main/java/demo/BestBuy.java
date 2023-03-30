package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import demo.Log4j;

import java.time.Duration;

public class BestBuy extends Log4j{

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications--");
        WebDriver driver = new ChromeDriver(options);

        driver .get(" https://www.bestbuy.com/");
        log.info("Open bestBuy");

        driver.manage().window().maximize();
        log.info("Maximize window");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("(//a[contains(@class,'us-li')])[1]")).click();
        log.info("click button");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@id,'gh-search')]")).sendKeys("laptops");
        log.info("Type laptop");
        driver.findElement(By.xpath("//span[contains(@class,'header-search-icon')]")).click();
        log.info("click search button");

        String count= driver.findElement(By.xpath("(//span[contains(@class,'item-coun')])[1]")).getText();
        log.info("Get the text of laptop brandName");
        driver.findElement(By.xpath("//fieldset[@name='Brand']//child::ul[contains(@class,'facet-option-list')]//input[contains(@id,'brand_facet-HP-0')]")).click();
        log.info("click button");
        driver.findElement(By.xpath("//fieldset[@name='Brand']//child::ul[contains(@class,'facet-option-list')]//input[contains(@id,'brand_facet-Dell-1')]")).click();
       String filteredProduct1 = driver.findElement(By.xpath("(//span[contains(@class,'nc-product-title clamp')])[1]")).getText();
       if(filteredProduct1.contains("HP") || filteredProduct1.contains("Dell")) {
           System.out.println("HP laptop & Dell laptop");
       }

        String filteredProduct2= driver.findElement(By.xpath("(//span[contains(@class,'nc-product-title clamp')])[2]")).getText();
        if(filteredProduct2.contains("HP") || filteredProduct2.contains("Dell")) {
            System.out.println("HP laptop & Dell laptop");
        }
        log.info("Check contains only HP & Dell laptops ");

        String countAdfterFilter=driver.findElement(By.xpath("(//span[contains(@class,'item-count')])[1]")).getText();
        if(countAdfterFilter.contentEquals(count)) {
            System.out.println("count different and reduced");
        }
        log.info("Check overall count reduced to HP & Dell laptops ");
    }


    }






