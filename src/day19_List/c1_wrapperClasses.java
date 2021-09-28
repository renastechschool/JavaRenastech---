package day19_List;

public class c1_wrapperClasses {

    //Primitive Data Types
    //byte
    //short
    //int
    //long
    //float
    //double
    //boolean
    //char

    ///non primitives object and objets are getting created by classes

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects
    //
    //	primitives: byte, short, int, long, float, double, char, boolean
    //
    //  wrapper classes:
    //		Byte, Short, Integer, Long, Float, Double, Character, Boolean

    //Java Wrapper Classes
    //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    //
    //The table below shows the primitive type and the equivalent wrapper class:
    //
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character
    //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
    // where primitive types cannot be used (the list can only store objects):

    //Example
    //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    //ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    public static void main(String[] args) {
        int i1=10; //primitive data type
        Integer myInt=10; //wrapper class object

        System.out.println(i1);
        System.out.println(myInt);

        Double myDouble=5.5; //wrapper class
        Character ch='b';//wrapper class

        short sh1=100; //pri
        int i2=sh1;//pri

        Integer myInt2=i2; //wrapper class
        //Integer myInt3=sh1; //Integer is another form of int primitive data type
        //you can not assigned different forms it has to be int

        Byte b1 = 10; //wrapper
        byte b2 =15; //primitive
        Byte b3 = b2; //wrapper

        //Integer myint3=b2;
       // Integer myint3=b3;

        System.out.println("b3 = " + b3);

        //--
//        toString method is used to convert wrapper objects to string

        Integer myInt5=155;
        String str=myInt5.toString(); //"155"
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
    }
}
