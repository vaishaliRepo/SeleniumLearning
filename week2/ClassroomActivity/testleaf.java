package week2.ClassroomActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleaf {

    public static void main(String[] args) {
        

    ChromeDriver driver= new ChromeDriver();
        driver.get(" https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

}

}