package day29_Polymorphism.abstractionPracticee;
//*
// 1. create an abstract class called Phone
//            attributes: brand, model, price, size
//            abstract methods: calling(), texting()
//            instance method: toString()
//
//create sub classes called iphone and samsung
//--create a static block to assign brand at begining for iphone and samsung
//--create a constructor to assign model , prize and size for iphone and samsung
//--override abstract methods from parent Phone class

// */
public abstract class Phone {

    //
//    create an abstract class named Phone
//            variables: brand, model, price
//    abstract methods: texting(), calling()

    public static String brand;
    public String model;
    public double price;

    public abstract void texting(long number);
    public abstract void calling(long number); //no body will be in abstract methods

    public String toString(){
        return "Phone Brand : " + brand + " Phone model : "+ model
                +" Phone Price : "+price;
    }




}


interface downloaddable{

    //
    public static final boolean download=true;
    abstract void downloadApp();

}

interface appleStore extends downloaddable{
    //belows methods and variables will be inherited
    //download and downloadApp

     String storeName="Apple";//final static


}

interface androidStore extends downloaddable{
    //belows methods and variables will be inherited
    //download and downloadApp
    String storeName="Android";
}