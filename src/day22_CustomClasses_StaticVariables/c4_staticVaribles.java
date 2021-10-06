package day22_CustomClasses_StaticVariables;
//Static variables
//
// When a variable is declared as static, then a single copy of variable is created
// and shared among all objects at class level. Static variables are, essentially, global variables.
// All instances of the class share the same static variable.
//
//We can create static variables at class-level only.
//static: class member, can be called through the class
//there is only one copy of static shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static
//
//
//    static members:
//            1. static variable (global variables)
//            2. static methods
//            3. static initializer block
//            4. static nested class
//

//static variable: declared outside any block with static keyword.
////there is only one copy of static shared by all objects

import MyUtil.util;

//Instance: every single object of the class has its own copy
//
//local variable: variables that are declared in a block
//
//instance variables: declared outside the blocks
//
//
public class c4_staticVaribles {


    int instanceVariable=25; // instance
    int number2=10; //instance

    static int staticVariable=100;//static variable   //static variable: declared outside any block with static keyword.

    public static void main(String[] args) { //static method
        //to be able to use instance varibles inside in static method we will need to create an object for it
        c4_staticVaribles object1=new c4_staticVaribles();
        System.out.println(object1.instanceVariable);//25

        System.out.println(staticVariable); // for static variables since they will have one copy for all objetcs
        //you dont need to create an object to print them

        c4_staticVaribles object2=new c4_staticVaribles();
        c4_staticVaribles object3=new c4_staticVaribles();

        object2.instanceVariable=250;
        object3.instanceVariable=500;


        object1.staticVariable=55;
        object2.staticVariable=155;
        object3.staticVariable=555;

        System.out.println("object1.instanceVariable = " + object1.instanceVariable);
        System.out.println("object2 = " + object2.instanceVariable);
        System.out.println("object23 = " + object3.instanceVariable);

        util.stars();
        //all the objects will have one copy for static variables
        //all the objects will return same result if variable is static
        System.out.println(object1.staticVariable);
        System.out.println(object2.staticVariable);
        System.out.println(object3.staticVariable);


        int number5=222;//local variable

    }


    {
      //block
    }



    //local variable : declerad inside of block

    //instance variable :declared outside of the blocks
    //instance variable can have multiple copy from object
    //they needs to be called through object

    //static variables :declared outside of any block with static keyword
    //static variable can only have one copy from object
    //they can also be called with classname itself

}
