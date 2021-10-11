package day24_AccessModifiers;

public class c2_printOrder {

    public c2_printOrder(){
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method started !!!");

        //creating object
        c2_printOrder obj1=new c2_printOrder();
        //this will trigger instance block and it also calls your constructor
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public static void methodStatic(){
        System.out.println("Static MEthod");
    }

    public void instanceMethod(){
        System.out.println("instance method");
    }
}


//1.no matter what if you run your class static block will run before everything and only once
//2.main method will run in order of line that passed

//each new object will run instance block and constructor together
//c2_printOrder obj1=new c2_printOrder();
//firt instance block will get executed before constructor