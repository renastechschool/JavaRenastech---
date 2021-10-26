package day29_Polymorphism;

public class Polymorphism {

    //it is another concept of oop

    //Polymorphism in Java is the ability of an object to take many forms.
    //    //// To simply put, polymorphism in java allows us to perform the same action in many different ways.
    //
    //    ////WebDriver driver=new ChromeDriver();
    //    ////WebDriver driver=new FirefoxDriver();

    public static void main(String[] args) {
        car car1 = new car();
        BMW bmw1 =new BMW();
        Toyota tyta1= new Toyota();

        //Polymorphism in Java is the ability of an object to take many forms.
        car bmw2=new BMW();
        car tyto2=new Toyota();

        //BMW bmw3 = new car();
        //you can not create an object from child class taht will take form as a parent

        car [] arr={car1,bmw1,bmw2,tyta1,tyto2};
        BMW [] arr2= {bmw1};
        //bmw array will only accept bmw objects and bmw 2 it is object from car that has form of bmw
        //but it is not the bmw object
    }
}

class  car{

}

class BMW extends car{

}

class Toyota extends car{

}