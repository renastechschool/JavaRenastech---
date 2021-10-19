package day27_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class c3_ExceptionHandling {

    //there is 2 way to handle exceptions so they dont stop compiler from running
    //first you can use try/catch blocks to handle
    //second you can use throws keyword to handle

    public static void main(String[] args) {
        System.out.println("Compiler Started");

        try{
            System.out.println("Waiting for 5 second");
            Thread.sleep(5000);  //checked exception(.InterruptedException;)
        }catch (InterruptedException e){
            //Exception is the parent of all the exception types
            //you can use Exception to catch
            System.out.println("e.getMessage() = " + e.getMessage());

        }

        System.out.println("waiting is done ");

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,89,10));

        try {
            System.out.println("list.get(20) = " + list.get(20));//uncheked  IndexOutOfBoundsException

        }catch (IndexOutOfBoundsException e){
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            System.out.println("e.getMessage() = " + e.getMessage());

        }


        int number=0;

        while (number < 60){
            System.out.println(number );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            number ++;
        }


    }

}
