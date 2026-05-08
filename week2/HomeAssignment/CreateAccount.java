package week2.HomeAssignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
    public static void main(String[] args) {

   //Initialize the WebDriver (ChromeDriver). 

          //ChromeDriver driver=new ChromeDriver();
          EdgeDriver driver = new EdgeDriver();

    //Implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    // Load the URL http://leaftaps.com/opentaps/

         driver.get("http://leaftaps.com/opentaps/"); 

    //Maximize the browser window

         driver.manage().window().maximize();
    //Enter a username and password
    driver.findElement(By.id("username")).sendKeys("DemoCSR");
    driver.findElement(By.id("password")).sendKeys("crmsfa");

    //Click the "Login" button
    driver.findElement(By.className("decorativeSubmit")).click();

    //Click on the "CRM/SFA" link
    driver.findElement(By.linkText("CRM/SFA")).click();
    
    //Click on the "Accounts" tab
    driver.findElement(By.linkText("Accounts")).click();

    //Click on the "Create Account" button
    driver.findElement(By.linkText("Create Account")).click();

    String name="Vaishali4";
    //Enter an account name
    driver.findElement(By.id("accountName")).sendKeys(name);

    //Enter a description as "Selenium Automation Tester"
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

    //Select "ComputerSoftware" as the industry. 
    //driver.findElement(By.name("industryEnumId")).click();
    //driver.findElement(By.partialLinkText("Computer Software")).click();

    WebElement industry = driver.findElement(By.name("industryEnumId"));
    Select industryDD= new Select(industry);
    industryDD.selectByValue("IND_SOFTWARE"); // ComputerSoftware will be selected

    //Select "S-Corporation" as ownership using SelectByVisibleText

    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
    Select ownershipDD= new Select(ownership);
    ownershipDD.selectByVisibleText("S-Corporation");

    //Select "Employee" as the source using SelectByValue. 

    WebElement source = driver.findElement(By.id("dataSourceId"));
    Select sourceDD= new Select(source);
    sourceDD.selectByValue("LEAD_EMPLOYEE");
      
    //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
    WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
    Select marketingDD= new Select(marketing);
    marketingDD.selectByIndex(6);
    
    //Select "Texas" as the state/province using SelectByValue
    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
    Select stateDD= new Select(state);
    stateDD.selectByValue("TX");

    //Click the "Create Account" button

    driver.findElement(By.className("smallSubmit")).click();

    //Verify that the account name is displayed correctly. 
    String actualNameString = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();

    System.out.println(actualNameString);

    if (actualNameString.equals(name)) {
        System.out.println("Acct verified");
        
    } else {
        System.out.println("Acct not verified");
    }

    //Close the browser window
    //driver.quit();

    }

}
