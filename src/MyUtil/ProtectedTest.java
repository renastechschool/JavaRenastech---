package MyUtil;

import day25_Inheritance.ProtectedExample;

public class ProtectedTest extends ProtectedExample {


    // protected int protecNumber;
    //    public int publicNumber;
    //    private int priaveNumber;
    //    int defaultVrble;
    public static void main(String[] args) {
        ProtectedExample obj1 =new ProtectedExample();
        obj1.publicNumber=10;//everywhere
       // obj1.priaveNumber=20;//only same class
        obj1.protecNumber=20;//same package and if it is extended (//if variable is static varible )

        //obj1.defaultVrble=40;//only same package


    }
}
