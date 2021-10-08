package day23_Constroctors;

public class c4_StaticBlock {

    static int st1=10;
    static int st2=20;
    int ins1=30;

    public static void main(String[] args) {
        System.out.println(st1);
        System.out.println(st2);
       // System.out.println(ins1); to be able to call instance varibale in static method
        //we will need to create object

        //to create object i need call class name
        c4_StaticBlock obj1=new c4_StaticBlock();
        System.out.println("obj1.ins1 = " + obj1.ins1);

    }

    static {
        System.out.println("Static Block");
        st1=100;
        st2=200;

    }
}
