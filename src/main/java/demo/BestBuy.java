package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BestBuy {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications--");
        WebDriver driver = new ChromeDriver(options);

        driver .get(" https://www.bestbuy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("(//a[contains(@class,'us-li')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@id,'gh-search')]")).sendKeys("laptops");

        driver.findElement(By.xpath("//span[contains(@class,'header-search-icon')]")).click();
        String count= driver.findElement(By.xpath("(//span[contains(@class,'item-coun')])[1]")).getText();
        driver.findElement(By.xpath("//fieldset[@name='Brand']//child::ul[contains(@class,'facet-option-list')]//input[contains(@id,'brand_facet-HP-0')]")).click();
        driver.findElement(By.xpath("//fieldset[@name='Brand']//child::ul[contains(@class,'facet-option-list')]//input[contains(@id,'brand_facet-Dell-1')]")).click();
       String filteredProduct1 = driver.findElement(By.xpath("(//span[contains(@class,'nc-product-title clamp')])[1]")).getText();
       if(filteredProduct1.contains("HP") || filteredProduct1.contains("Dell")) {
           System.out.println("HP laptop & Dell laptop");
       }
        String filteredProduct2= driver.findElement(By.xpath("(//span[contains(@class,'nc-product-title clamp')])[2]")).getText();
        if(filteredProduct2.contains("HP") || filteredProduct2.contains("Dell")) {
            System.out.println("HP laptop & Dell laptop");
        }

        String countAdfterFilter=driver.findElement(By.xpath("(//span[contains(@class,'item-count')])[1]")).getText();
        if(countAdfterFilter.contentEquals(count)) {
            System.out.println("count different and reduced");
        }
    }


    }






