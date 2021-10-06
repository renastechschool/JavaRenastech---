package day22_CustomClasses_StaticVariables;

import MyUtil.util;

//When a method is declared with static keyword, it is known as static method.
// The most common example of a static method is main( ) method.As discussed above,
// Any static member can be accessed before any objects of its class are created,
// and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.
public class c5_StaticMethod {

    int aInstance =10;
    static int bStatic=20;

    public static void main(String[] args) {//static method
        //System.out.println(aInstance);
        // you cant call instance varible in static method without creating object from class
        c5_StaticMethod obj1=new c5_StaticMethod();
        System.out.println("obj1.aInstance = " + obj1.aInstance); //10
        System.out.println("bStatic = " + bStatic);

        //instanceMethod(); we cant call instance method without object
        obj1.instanceMethod();
        staticMethod();


        //to be able call different class static method
        //you can just call with classname
        util.stars();
        //to be able to call different class instance method
        //you will need to create an object
    }

    public void instanceMethod(){//without static keyword your method will be an instance method
        System.out.println("This is instance method");
        System.out.println(aInstance);
        //since method is instance we dont need to create a object inside this method
        // to be able to call instance variable

        System.out.println(bStatic);//static variables know as global variable
        //they can be used in any method

    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }

}
