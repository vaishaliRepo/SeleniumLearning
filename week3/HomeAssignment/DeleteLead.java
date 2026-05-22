package week3.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

    public static void main(String[] args) throws InterruptedException {

        //Initialize the WebDriver (ChromeDriver)        
        EdgeDriver driver= new EdgeDriver();

        //Load the URL http://leaftaps.com/opentaps/. 
        driver.get("http://leaftaps.com/opentaps/");

        //Maximize the browser window.
        driver.manage().window().maximize();

        //Enter the username
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        //Enter the password.
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        //Click the Login button. 
        driver.findElement(By.className("decorativeSubmit")).click();

        //Click the "crm/sfa" link. 
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Click the "Leads" link. 
        driver.findElement(By.linkText("Leads")).click();

        //Click "Find leads." 
        driver.findElement(By.linkText("Find Leads")).click();

        //Click on the "Name and ID" tab. 
        driver.findElement(By.xpath("(//span[contains(@class,'x-tab-strip-inner')]/span)[1]")).click();
        
        //Enter the LeadID. 
        driver.findElement(By.name("id")).sendKeys("12114");

        //Click the "Find leads" button.
        driver.findElement(By.xpath("//button[contains(text(),\"Find Leads\")]")).click();
        Thread.sleep(2000);

        //Capture the lead ID of the first resulting lead.
        String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
        System.out.println("Lead ID : " + leadID);

        //Click the first resulting lead. 
         driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

         //Click the "Delete" button.
         driver.findElement(By.linkText("Delete")).click();

         //Click "Find leads" again.             
        driver.findElement(By.linkText("Find Leads")).click();

        //Enter the captured lead ID.
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

        //Click the "Find leads" button.
        driver.findElement(By.linkText("Find Leads")).click();
        Thread.sleep(2000);

        //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. 
       WebElement pageElement = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
       String pagecontent= pageElement.getText();
       Thread.sleep(1000);
        if(pagecontent=="No records to display")
        {
            System.out.println("Lead has be deleted successfully");
                    }

        //Close the browser.

    driver.quit();
    }


}
