package day26_owerwriting;


class test {

    //access modifier + classname
    public test(){
        System.out.println("Test");
    }

}

public class C1_Constructor extends test{
    //since we extend test class
    //everything inside test will be inherited
    //inherite test constructor  == public test ()

    public C1_Constructor(){
        System.out.println("C1 constructor");
    }

    public C1_Constructor(String str){
        this();
        System.out.println("c1 string constr");
    }

    public static void main(String[] args) {
        //test obj1=new test();

        //constructor will get executed if we create object

        C1_Constructor obj2=new C1_Constructor();
        //since c1_constr take test class as parent
        //constructor of test also will be inherited
    }

}
