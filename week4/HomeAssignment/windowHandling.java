package org.testleaf.week4.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandling {

    public static void main(String[] args) {
        
        EdgeDriver driver= new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//div[@id='label']//a")).click();

        driver.findElement(By.xpath("//div[@class='x-panel-header']//a[contains(text(),'Contacts')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
        
    }

}
