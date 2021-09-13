package day11_whileLoop;

import java.util.Scanner;

//create a java logic that will sum the given numbers
//ex if input is 5 ;
//output will be 1 + 2 +3 + 4 +5 == 15
public class c5_sumOfNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = input.nextInt();//this will read what user enters
        System.out.println("number is "+number);

        ////ex if input is 5 ;
        ////output will be 1 + 2 +3 + 4 +5 == 15
        int start=0;
        //you have to print sum result
        int sum=0;

        while (start<=number){//0 1 2 3 4>3
//            System.out.println("Sum is in the while loop : "+sum);
            sum += start;//0 +1  2 +3
//            System.out.println("Sum is after += sign" + sum);
            start++;//1 2 3 4
        }
        System.out.println("Sum is at the end "+sum);

    }

}
