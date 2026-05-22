package week3.classroomActivity;

public class Chrome extends Browser {

    public void  openIncognito()
    {
        System.out.println("OpenIncognito method from child class");
    }

    public void  clearCache() 
    {
      System.out.println("ClearCache method from child class");  
    }


    public static void main(String[] args) {

            Chrome coptions= new Chrome();
        coptions.openURL();
        coptions.closeBrowser();
        coptions.navigateBack();

        System.out.println("Browser Name is: "+ coptions.browserName);
        System.out.println("Browser Version is: "+coptions.browserVersion);
   
        coptions.openIncognito();
        coptions.clearCache();
        
    }

}
