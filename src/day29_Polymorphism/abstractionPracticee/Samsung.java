package day29_Polymorphism.abstractionPracticee;
////
////create sub classes called iphone and samsung
////--create a static block to assign brand at begining for iphone and samsung
////--create a constructor to assign model , prize and size for iphone and samsung
////--override abstract methods from parent Phone class
public class Samsung extends Phone implements androidStore {

    //after we extending phone
    //brand,model,price    inherited
    //texting,calling       inherited   --- abstract methods  (you need owerride )
    //tostring            inherited

    //after we implement the applestore
    //storename
    //download
    //downloadApp method -- abstract (you need owerride )

    ////--create a static block to assign brand at begining for iphone and samsung
    static {
        brand = "---Samsung---";
    }

    //access modifier + classname
    //////--create a constructor to assign model , prize and size for iphone and samsung
    public Samsung(String model , double price){
        this.model=model;
        this.price=price;
    }

    ////--override abstract methods from parent Phone class and androidstore
    @Override
    public void texting(long number){
        System.out.println(brand + "  " + model + " is texting " + number);
    }

    @Override
    public void calling(long number){
        System.out.println(brand + "  " + model + " is calling " + number);
    }

    @Override
    public void downloadApp(){
        System.out.println(brand + " " + model + " is downloading from "+ storeName);
    }


    public void helloSamsung(){
        System.out.println(brand + model + " is here ");
    }

}
