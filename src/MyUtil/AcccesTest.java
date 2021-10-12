package MyUtil;

import day24_AccessModifiers.c3_AccessModifiers;

public class AcccesTest {

    public static void main(String[] args) {
        c3_AccessModifiers obj1=new c3_AccessModifiers();

        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
       // System.out.println("obj1.publicVariable = " + obj1.defaultVrble);
        // default cant be accessed outside of package
       // System.out.println("obj1.publicVariable = " + obj1.protectedVariable);
        //protected variable can not be accessed from outside of package if classes doesnt have relation
        //if classes has parent child relation it will be possible to access
       // System.out.println("obj1.publicVariable = " + obj1.priavteVariable);
    }
}
