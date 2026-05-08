package week2.ClassroomActivity;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchFacebook {

    public static void main(String[] args) {
        
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
       driver.quit();         
    }

}
