package week2.ClassroomActivity;

public class Browser {

    public String launchBrowser(String browserName)
    {
       System.out.println("browser is internet explorer" + browserName);
       return browserName;
    }
    public void loadUrl()
    {
       System.out.println("www.google.com");
    }
    public static void main(String[] args) {

        Browser Google =new Browser();
        Google.launchBrowser("www.google.com");
        Browser url = new Browser();
        url.loadUrl();
        
    }

}
