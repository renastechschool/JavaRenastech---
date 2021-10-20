package day28_Abstraction.Driver;

public class FirefoxDriver extends Driver{

    //    //after extending Driver class below method will be inherited
    //             // abstract void openBrowser();
    //             //abstract void getURL(String url);
    //             //void closeBrowser(){
    public final String driverName="firefox";
    @Override
    public void openBrowser() {
        System.out.println("browser = " + driverName  + " is opening ");
    }

    @Override
    public void getURL(String url) {
        System.out.println("Opening url = " + url + " in Firefox");
    }




}
