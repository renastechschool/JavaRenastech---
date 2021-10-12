package day24_AccessModifiers;

public class c3_AccessModifiers {
    //			Access modifiers: public, protected, default, private
    // access modifiers explain your access level to the variable ,method or class

    //Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.
    //Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    //Protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    //Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.

    //variables

    public int publicVariable=10; // public instance variable
    private int priavteVariable=25;
    int defaultVrble=35;
    protected  int protectedVariable=5;

    public static void main(String[] args) {
        //to be able call instance variable createa an object
        c3_AccessModifiers obj1=new c3_AccessModifiers();
        //object create with java deafult constructor


        //we are in the same class that we create objects
        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.defaultVrble = " + obj1.defaultVrble);
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.priavteVariable = " + obj1.priavteVariable);
    }

}
