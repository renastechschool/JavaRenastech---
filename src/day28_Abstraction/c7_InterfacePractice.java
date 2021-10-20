package day28_Abstraction;

public interface c7_InterfacePractice {
    //what we can have in interface?
    //variable: static & final by default
    //methods: abstract methods, static methods, default method

//    what we cannot have in interface?
//    constructor
//    instance variable
//    instance methods
//    blocks

//    public c7_InterfacePractice(){
//
//    }

    ///{ }

//    public void method1(){
//        instance method
//    }

    //    //variable: static & final by default
    int number=100; //final static
    final static int number2=35; // final static

    public static void main(String[] args) {
        System.out.println(number);

//        number = 25 ;  final variables can not be reassigned
        System.out.println(number2);
//        number2=0;  final variables can not be reassigned


    }

}
