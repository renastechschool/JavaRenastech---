package day29_Polymorphism;

public class Inheritance {

    // //oop questions
    //    //tips to remember
    //
    //    //1.explain what is it
    //    //2.explain how you achive
    //    //3.where you are using in your project

    //why oop
    //Reusability
    //flexible
    //easy to update  --- easy to maintain our code
    //memory -- it will reduce memory
    //easy to read and remember fuctions that you created


    public double number;
    protected int number2;
    byte number3;

}

class inherTest extends Inheritance{
//it will inherited all the methods from parent
    public static void main(String[] args) {
        inherTest obj =new inherTest();
        obj.number=100;
        obj.number2=200;
        obj.number3=50;

        System.out.println("obj.number2 = " + obj.number2);
    }
}