package day24_AccessModifiers;

public class c1_CostructorChainningPractice {

    //
//    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or conatin itself

   //creating constructor\
    // access modifier and class name
    public c1_CostructorChainningPractice(){
        //            2. constructor cannot be called by its name,  this() is used for calling
       // c1_CostructorChainningPractice("hello");
        this("hello");
        System.out.println("Default Constructor");
    }

    public c1_CostructorChainningPractice(String str){
        this(10,10);
        System.out.println("constr with String");
        // 3. constructor call needs to be at the first step
        //this(10,10);
    }

    public c1_CostructorChainningPractice(int num,int num2){
       // 4. One constructor can only call one constructor
        this(true,10.5);
       // this();
        System.out.println("int const");
    }

    public c1_CostructorChainningPractice(boolean b ,double d){
        //this("hello");
        ////            5. Contructor cannot call itself or conatin itself
        //this(true,5.5);
        System.out.println("constr with double and boolean ");
    }

    public static void main(String[] args) {
        c1_CostructorChainningPractice obj1=new c1_CostructorChainningPractice(10,10);
        //we created object from class by using int constructor
        c1_CostructorChainningPractice obj2=new c1_CostructorChainningPractice(true,10.5);
    }
}
