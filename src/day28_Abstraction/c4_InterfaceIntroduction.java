package day28_Abstraction;

public interface c4_InterfaceIntroduction {
    //            there is only one access modifier allowed in interface ==> public
    // you can implement inheritence in the interfaces by using implements keyword (instead of extand)
    // you can implement multiple interfaces

    //differences between abstract class and interface
    //A class can inherit from one class only (extends)
    //A class can inherit multiple interfaces (implements)

    //what we can have in interface?
    //variable: static & final by default
    //methods: abstract methods, static methods, default method

//    what we cannot have in interface?
//    constructor
//    instance variable
//    instance methods
//    blocks

    //void method1(){} we cant have instance method in interface
    default  void method1(){}
    static void method2(){}
    public abstract void method3();  // public abstract
    // abstract method doesnt have a body
    abstract void method4(); // public abstract
    void method5();// public abstract

}
