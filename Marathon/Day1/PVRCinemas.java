package Marathon.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

    public static void main(String[] args) throws InterruptedException {

        // Launch the browser
        ChromeDriver driver = new ChromeDriver();

        // Load the application URL
        driver.get("https://www.pvrcinemas.com/");
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Maximize the browser window.
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Select location as Chennai if not auto-detected
        String location = driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).getText();
        if (location == "Chennai") {
            System.out.println("Location is: " + location);

        } else {
            driver.findElement(By.xpath("(//span[@class='cities-placed']//img)[2]")).click();
            driver.findElement(By.xpath("//div[@class='cities-names']/span[contains(text(),'Chennai')]")).click();

        }

        // Click on Cinema under Quick Book
        driver.findElement(By.xpath("(//div[@class='date-show']/span)[2]")).click();

        // Select a cinema
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
        Thread.sleep(2000);

        // Select date as Tomorrow
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
        Thread.sleep(2000);

        // Select a movie
        driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]")).click();
        Thread.sleep(2000);

        // Select show time
        driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]/span")).click();

        // Click on Book button
        driver.findElement(By.xpath("//div[@class='d-flex quick-booking-from']//div//span[text()='Book']")).click();
        Thread.sleep(5000);

        // Accept Terms and Conditions
        driver.findElement(By.xpath("//button[contains(text(),Accept) and @class='sc-kCuUfV iBvycX reject-terms']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),Accept) and @class='sc-kCuUfV iBvycX reject-terms']")).click();
        // Select any one available seat
        driver.findElement(By.xpath("//span[@class='seat-current-pvr' and contains(@id,'CL.CLUB')]")).click();

        // Click on Proceed button
        driver.findElement(By.xpath("//button[@class='sc-bbbBoY kbsOBB btn-proceeded' and contains(text(),'Proceed')]"))
                .click();

        // Capture and print Seat info from Booking Summary
        String seatInfo = driver.findElement(By.className("seat-info")).getText();
        System.out.println("Seat Info from Booking summary:  " + seatInfo);
        Thread.sleep(2000);

        // Capture and print Grand Total from Booking Summary
        String total = driver.findElement(By.xpath("//h6[text()='Grand Total']/following::span")).getText();
        System.out.println("Grand Total is  " + total);

        // Click on Continue button
        driver.findElement(By.xpath("//button[@class='fb-added-btndesk' and contains(text(),'Continue')]")).click();
        Thread.sleep(2000);

        // Close the popup if displayed
        driver.findElement(By.xpath("(//i[contains(@class,'pi pi-times')])[2]")).click();

        // Capture and print current page title
        String title = driver.getTitle();
        System.out.println("Page title is  :" + title);
        Thread.sleep(2000);

        // Close the browser
        driver.quit();

    }

}
