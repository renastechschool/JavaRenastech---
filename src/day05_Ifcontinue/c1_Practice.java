package day05_Ifcontinue;

public class c1_Practice {

    //32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

    public static void main(String [] args){
        int number1=30;
        int number2=30;

        //==
        //!=
        //<=
        //>=
        //>
        //<

        //if staments will be very usefull if you have some preconditions to print your code

        if (number1 == number2){ // if numbers are equal print below println
            System.out.println(number1 + " == " +number2);
        }

        if (number1 != number2){ // if numbers are not equal print below println
            System.out.println(number1 + " != " +number2);
        }

        if (number1 < number2){
            System.out.println(number1 + " < " + number2);
        }

        if (number1 > number2){
            System.out.println(number1 + " > " + number2);
        }

        if (number1 <= number2) {
            System.out.println(number1 + " <= " +number2);
        }

        if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        }




        int i1=20; //21 //21  //22
        int i2= -i1++ + i1 - ++i1;
             // - (20) + 21 -(22)
             // -20 + 21 -22
            //1 -22
            //-21

        //first it will always check inside the parantes
        //then it will check multiple or division or reminder
        //then you will go in order

        System.out.println(i2);

        //check i2 number if it is posstive print i2 is possitive
        //if it is negetive print i2 is negative

        //if number smaller then zero -- negative
        //if number bigger then zero -- positive
        if (i2 < 0){
            System.out.println(i2 + " is negative");
                             //-21    is negative
        }

        if (i2 > 0){
            System.out.println(i2 + " is positive");
        }

        //number + number == new number
        //number + text == numbertext

    }
}
