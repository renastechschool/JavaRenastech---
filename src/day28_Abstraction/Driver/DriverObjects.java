package day28_Abstraction.Driver;

public class DriverObjects {

    public static void main(String[] args) {
        ChromeDriver obj=new ChromeDriver();
        obj.openBrowser();
        obj.getURL("www.google.com");
        obj.closeBrowser();

        FirefoxDriver obj2 = new FirefoxDriver();
        obj2.openBrowser();
        obj2.getURL("www.facebook.com");
        obj2.closeBrowser();
    }
}
