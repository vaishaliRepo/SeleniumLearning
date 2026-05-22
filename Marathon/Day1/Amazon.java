package org.testleaf.Marathon.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {
        
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/ ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
       // driver.findElement(By.id("nav-search-submit-button")).click();

    //Capture and print the total number of search results displayed
    String TotalResult = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
   System.out.println("Total number of search results displayed : " +TotalResult);

   //Select the first two brands from the left-side filter menu
   driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
   driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
   Thread.sleep(2000);

  //Apply sorting by selecting "New Arrivals"

   WebElement sort = driver.findElement(By.id("s-result-sort-select"));
   Select sortDD= new Select(sort);
   sortDD.selectByVisibleText("Newest Arrivals");

   //Capture and print the first product details (name and discounted price)
    String Brand = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
     String Price = driver.findElement(By.xpath("//span[@class='a-price']")).getText();
    System.out.println(" Brand name of the Bag : " +Brand);
    System.out.println(" Price of the Bag : " +Price);

    // Capture and print the page title
    String title = driver.getTitle();
    System.out.println("Page Title : " + title);

    //Close the browser
    driver.quit();
    System.out.println("Thanks for execution of this TC");

    }

}
