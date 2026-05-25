package week4.HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandling {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//div[@id='label']//a")).click();

        driver.findElement(By.xpath("//div[@class='x-panel-header']//a[contains(text(),'Contacts')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();

        // Click on the widget of the "From Contact".
        driver.findElement(By.xpath("//*[@id='partyIdFrom']/following::img[1]")).click();

        // windowhandles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>(windowHandles);

        String Child = windowsList.get(1);
        driver.switchTo().window(Child);
        Thread.sleep(3000);

        driver.findElement(By.className("linktext")).click();

        driver.switchTo().window(windowsList.get(0));

        //Click on the widget of the "To Contact"
        driver.findElement(By.xpath("//*[@id='partyIdFrom']/following::img[2]")).click();

        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> tolist = new ArrayList<>(windowHandles2);

        String child2 = tolist.get(1);
        driver.switchTo().window(child2);

        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
        Thread.sleep(2000);
       //Click on the Merge button.
       driver.switchTo().window(windowsList.get(0));
       driver.findElement(By.className("buttonDangerous")).click();

       // Accept the alert
       Alert alert= driver.switchTo().alert();
       alert.accept();
     

       //Verify the title of the page
       String title = driver.getTitle();
       System.out.println("Title of the page : " +title);
        
    }

}
