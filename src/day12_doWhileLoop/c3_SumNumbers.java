package day12_doWhileLoop;

import java.util.Scanner;

public class c3_SumNumbers {

    /// task
    //Write a do-while loop that asks the user to enter two numbers.
    // The numbers should be added and the sum displayed.
    // The loop should ask the user whether he or she wishes to perform the operation again.
    // If so, the loop should repeat; otherwise it should terminate.
    // if user says y or Y continue
    // if user says n or N stop the loop
    public static void main(String[] args) {
        int number1 , number2 ;
        char choice; //y or n
        Scanner input=new Scanner(System.in);

        do {
            //ask user to enter a number
            System.out.println("Enter First Number ");
            number1=input.nextInt();
            System.out.println("Enter Second Number ");
            number2=input.nextInt();

            // The numbers should be added and the sum displayed.
            int sum = number1 + number2;
            System.out.println("Sum of "+number1+ " + " +number2 + " is : "+sum );

            // The loop should ask the user whether he or she wishes to perform the operation again.
            // If so, the loop should repeat; otherwise it should terminate.
            // if user says y or Y continue
            // if user says n or N stop the loop
            System.out.println("Do you want to sum 2 new numbers y/n");
            choice=input.next().charAt(0);

        }while (choice == 'y' || choice=='Y');


    }


}
