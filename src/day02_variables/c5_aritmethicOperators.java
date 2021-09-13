package day02_variables;

public class c5_aritmethicOperators {

    public static void main(String [] args){

//        float	            4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	        8 bytes	        Stores fractional numbers. Sufficient for storing 15 decimal digits


        double doubled1=5.5;
        System.out.println(doubled1);
        double d2=5.5555555555555;
        System.out.println(d2);

        //        As a default java picks double for decimal number
        System.out.println(2.5);

        float f1=2.5f; // java will take decimel numbers as a double thats why you need tell compiler this is an float number
        System.out.println(f1);


        System.out.println("*******************");
        System.out.println(2+5); //it will sum the numbers
        System.out.println("2+5"); // it will print the text as it is.

        int i1=3;
        int i2=5;

        //sum of 2 numbers
        System.out.println(i1 + i2);

        double number1=2.5;
        double number2=3.5;

        System.out.println(number1+number2);//6.0

        //minus operator
        System.out.println(i1-i2);//-2
        System.out.println(number1-number2);//-1.0
        System.out.println(number1- i1);//-0.5

        //multiple operator
        System.out.println(i1*i2);
        System.out.println(number1*number2);

        //division
        System.out.println(i2/i1);// 5/3
        System.out.println(5/3); // 2 numbers are int here result will be also int   1
        System.out.println(5/3.0);//since we use one number as a double  result also will be double 1.66666..

        System.out.println(10/2); //5
        System.out.println(10.0/2); //5.0

        //reminder
        System.out.println(10 % 5);

        System.out.println(10/3); //3
        System.out.println(10 % 3);
        System.out.println(10.0 % 3);
    }
}
