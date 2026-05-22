package org.testleaf.week4.ClassroomActivity;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

    public static void main(String[] args) {
        
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();

        //getwindowshandle
        Set<String> alladdress = driver.getWindowHandles();
        List<String> alladdresslist = new ArrayList<>(alladdress);

        String childaddress = alladdresslist.get(1);
        driver.switchTo().window(childaddress);
        String Fligtaddress = driver.getTitle();
        System.out.println("Flight tab address:  " +Fligtaddress);

        driver.switchTo().window(alladdresslist.get(0));
        driver.close(); 

    }

}
