package day02_variables;
//        Primitive Data Types
//        A primitive data type specifies the size and type of variable values, and it has no additional methods.
//
//                There are eight primitive data types in Java:
//
//        Data Type	        Size	        Description
//        byte	            1 byte	        Stores whole numbers from -128 to 127
//        short             2 bytes	        Stores whole numbers from -32,768 to 32,767
//        int	            4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	            8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


//        float	            4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	        8 bytes	        Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean	        1 bit	        Stores true or false values
//        char	            2 bytes	        Stores a single character/letter or ASCII values   'a'
//
//primitive data types: byte, short, int, long, float, double, char, boolean
//
//        for numbers: byte, short, int, long, float, double
//
//
//        whole number: byte, short, int, long
//
//        decimal number: float, double
//
//        range:
//        double > float > long > int > short > byte
//
//        larger one cannot be assigned to smaller one
//        smaller one can be assigned to larger one
//
//
//        As a default java picks int for whole number
//        As a default java picks double for decimal number
//
//
//
//        Non primitive types: String, Object
//        There are also reference types that wrap the primitive types.
//        These can be useful if you need a make a variable null or use it in a class that requires a non-primitive type
//
//        Non primitives are usually objects that we create (the exception being String)

public class c4_variables {

    public static void main(String [] args){
        //        for numbers: byte, short, int, long, float, double
        //        whole number: byte, short, int, long
//        range:
//        double > float > long > int > short > byte

        //        byte	            1 byte	        Stores whole numbers from -128 to 127
        byte number1=25;
        System.out.println(number1);

        //byte number2=128; this will give you error  because its out of range
        //byte b1=2.5; this will also give you error beacuse its decimel number

        byte number2=-100;
        System.out.println(number2);

        //        short             2 bytes	        Stores whole numbers from -32,768 to 32,767
        short s1=128;
        short s2=20000;

        //short s3=40000; //out of range

        short s4=20; // it covers also byte range

        System.out.println("**************");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);

        System.out.println("***************");

//        int	            4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int umit=3123123;
        System.out.println(umit);

        System.out.println("35"); // this is text
        System.out.println(35); // this is actual number
        ////        As a default java picks int for whole number

        //int i2=3434345353;  out of range
        //System.out.println(i2);


        //        long	            8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l1=200;
        long l2=123123123133L;//when you move out int range compiler needs to know what is this number
        //that is why we pass L at the end to tell java this is Long numebr

        System.out.println(l1);
        System.out.println(l2);

    }
}
