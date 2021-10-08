package day23_Constroctors;

public class c3_StaticBlock {

    //in java as aclass member we have method,variables , class
    //and optinal you can create a block (Static instance)

    int instVrble=10;
    static int staticVrble=20;

    public static void main(String[] args) {//static method

        System.out.println("This is main method");
        methodStat();

        c3_StaticBlock obj1=new c3_StaticBlock(); //This is instance block
        //will be excuted if you create an object from class
        //objects will triger instance block
        c3_StaticBlock obj2=new c3_StaticBlock(); //This is instance block
        //second object will triger instance block again

        obj2.methodInstance();

    }

    public static void methodStat(){
        System.out.println("This is static method");
    }
    public void methodInstance(){
        System.out.println("This is instance method");
    }

    //blocks

    {
        //instance block
        System.out.println("This is instance block");
    }
    static {
        //static block
        System.out.println("This is static block");
        //this static block will get executed before everything
    }

    //instance block : will be executed for any new object
    //static block : will be executed once before everything

}
