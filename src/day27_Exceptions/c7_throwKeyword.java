package day27_Exceptions;

import java.util.NoSuchElementException;

public class c7_throwKeyword {

    public static void main(String[] args) {
        NoSuchElementException obj =new NoSuchElementException();
      //  throw obj;

        //throw vs throws
        //throw will throw exception to your code
        //throws will handle exceptions

        try {
            throw new ArithmeticException();

        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            System.out.println("e.getCause() = " + e.getCause());
        }
    }
}

//in the future you may need to handle some of exceptions such as
//waaiting  realated
//sql related
//file related

//100 string check if they have index number 10
//give me result whihc ones doesnt have
//string doesnt have it