package day26_owerwriting;
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

class test2{

    public test2(String str){
        System.out.println("test2 string");
    }
    public test2(int number){
        System.out.println(" test 2  int ");
    }

}
public class c2_ConstructorSuper extends test2{
    //if you extend a parent class that has more then one constructor
    //you will need to tell java which constructor should be executed

    //From base class: by using super() keyword to call constructor from the base class.-- we will see this later


    public c2_ConstructorSuper(){
        super(10);

        //super("a");
        System.out.println("c2 cons ");
        //super(10);

    }

    public c2_ConstructorSuper(String str,int i ){
        super("hello");
    }

    public static void main(String[] args) {

        c2_ConstructorSuper obj1=new c2_ConstructorSuper();
        //object will trigger constructor   of child and parent as well
        //in the parent if you have more then one constructor
        //you will need to tell java which constructor to pick
    }
}
