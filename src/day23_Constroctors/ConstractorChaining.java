package day23_Constroctors;

public class ConstractorChaining {

    /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later

Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    //to be able create constructor
    //we need pass an access modifier and classname
    public ConstractorChaining(){
        System.out.println("Default const");
        method1();

    }
    //Within same class: It can be done using this() keyword for constructors in same class


    public ConstractorChaining(int a){
        //this();
       // this(10); you cant call same constructor in same constructor
        //it will make infinitive loop
        this("hi");
        System.out.println("int constr");
        method2();

        //this(); keyword has to be at the first line of body
    }

    public ConstractorChaining(String str){
       this();
        System.out.println("String const");
    }

    public void method1(){
        System.out.println("Method1");
    }

    public static void method2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        //ConstractorChaining obj1=new ConstractorChaining(10);
        ConstractorChaining obj1=new ConstractorChaining("java");
    }
}

///to be able to call constructor you will need to use this() , this(10) , this("hello) etc
//you can only call one costructor from another one
//this ( ) keyword has to be first line in your constructor

// //this: refers to object instances
//        //this.: instances of the object
//        //this(): used for calling constructors within current class