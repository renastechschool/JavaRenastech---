package day28_Abstraction.Driver;

public abstract class Driver {
    //try this taks with different driver types : Chrome,Firefox,Safari ...
    //Task : create a base abstract class
    //create a method call openBrowser  --- abstract method
    //create a method call getURL (String udl)    ---abstract
    //create a method call closeBrowser (Closing browser)

    public abstract void openBrowser(); // no body
    public abstract void getURL(String url); // no body
    public void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
