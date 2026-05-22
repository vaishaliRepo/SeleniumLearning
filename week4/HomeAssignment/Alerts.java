package org.testleaf.week4.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

public static void main(String args[]) throws InterruptedException{

    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.leafground.com/alert.xhtml");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    //Click on the "Prompt Box" button to trigger the alert. 
    driver.findElement(By.xpath("//h5[contains(text(),' Alert (Prompt Dialog)')]/following::span[text()='Show']")).click();
    Thread.sleep(2000);

    //Switch to the alert and type a message in the alert box
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("Vaishali");

    alert.dismiss();

    String text = driver.findElement(By.id("confirm_result")).getText();

    if (text=="User cancelled the prompt."){
        System.out.println("The alert was dismissed");
    }
    else{
        System.out.println(text);
    }

    driver.quit();

}
}
