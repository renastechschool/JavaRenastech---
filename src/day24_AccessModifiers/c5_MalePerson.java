package day24_AccessModifiers;

public class c5_MalePerson {

    //create variables for this class

    //isHuman
    public static boolean isHuman=true; // public unique variable
    //access level : everywhere

    public static char gender='M'; // public unique variable
    //access level : everywhere

    public String name;  // public not unique
    //access level : everywhere
    //public will give acces to ewerywhere
    //instance varibale that helps to cretae multiple copy of object

    int age; // default and not unique
    //access level : only in same package

    //ID
    private static long ID=2131423354;//priavate and unique variable
    //access level : only in same class



}
