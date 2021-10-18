package day27_Exceptions;
//Exceptions and errors both are subclasses of Throwable class.
// The error indicates a problem that mainly occurs due to the lack of system resources
// and our application should not catch these types of problems.
// Some of the examples of errors are system crash error and out of memory error.
// Errors mostly occur at runtime that's they belong to an unchecked type.
//
//Exceptions are the problems which can occur at runtime and compile time.
// It mainly occurs in the code written by the developers.
// Exceptions are divided into two categories such as checked exceptions and unchecked exceptions.
public class c1_ErrorVsExceptions {

    public static void main(String[] args) {
        method(5);
    }

    public static void method(int number){

        while (number != 0 ){
            number = number+1;//6
            method(number);//6  //StackOverflowError
        }
    }



}

class exceptionsExample{

    public static void main(String[] args) {
        int number1=100;
        int number2 = 0;

        int result = number1 / number2 ;
        //ArithmeticException // you cant divided numbers by zero
    }
}
