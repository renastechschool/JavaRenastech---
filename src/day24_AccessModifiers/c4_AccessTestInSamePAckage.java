package day24_AccessModifiers;

public class c4_AccessTestInSamePAckage {

    public static void main(String[] args) {
        c3_AccessModifiers obj1=new c3_AccessModifiers();

        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.publicVariable = " + obj1.defaultVrble);
        System.out.println("obj1.publicVariable = " + obj1.protectedVariable);
       // System.out.println("obj1.publicVariable = " + obj1.priavteVariable);
        //priavete will have access only from same class

    }
}
