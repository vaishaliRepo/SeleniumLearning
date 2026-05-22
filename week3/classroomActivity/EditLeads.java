package week3.classroomActivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {

    public static void main(String[] args) {
        
        //Iialize the WebDriver (ChromeDriver). 
           EdgeDriver driver=new EdgeDriver();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Load the URL http://leaftaps.com/opentaps/.  
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize the browser window. 
        driver.manage().window().maximize();

        //Enter the Username as "DemoSalesManager" and the Password as "crmsfa". 
       driver.findElement(By.id("username")).sendKeys("DemoCSR");
       driver.findElement(By.id("password")).sendKeys("crmsfa");

       //Click on the Login Button.
       driver.findElement(By.className("decorativeSubmit")).click();

       //Click on the CRM/SFA Link. 
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Click on the Leads Button. 
        driver.findElement(By.linkText("Leads")).click();

        //Click on Create Lead.
        driver.findElement(By.linkText("Create Lead")).click();

        //Enter the CompanyName Field Using Xpath. 
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TCS");;

        //Enter the FirstName Field Using Xpath.
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("vaishali1");

        //Enter the LastName Field Using Xpath. 
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("viswanathan");

        // Enter the FirstName (Local) Field Using Xpath. 
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("vaish");

        //Enter the Department Field Using any Locator of Your Choice.
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");

        //Enter the Description Field Using any Locator of your choice. 
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");

        //Enter your email in the E-mail address Field using the locator of your choice.
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");

        //Select State/Province as NewYork Using Visible Text.
        WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateDD = new Select(state);
        stateDD.selectByValue("NY");

        //Click on the Create Button. 
        driver.findElement(By.name("submitButton")).click();

        //Click on the edit button. 
        driver.findElement(By.linkText("Edit")).click();

        //Clear the Description Field. 
        driver.findElement(By.id("updateLeadForm_description")).clear();

        //Fill the Important Note Field with Any text. 
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation testing");

        //Click on the update button. 
        driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

        //Get the Title of the Resulting Page.
        String title = driver.getTitle();
        System.out.println("Ttitle of the page is: " +title);

        //Close the browser window.
        driver.quit();


    }

}
