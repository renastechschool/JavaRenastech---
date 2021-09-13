package day05_Ifcontinue;

public class c2_ifElseStatements {

    // 2 number
    // please create a java program to check if this 2 number equal or not
    // if it is equal print : numbers are equal
    // if it is not  print : numbers are not equal

    public static void main(String [] args){

        int num1=25;
        int num2=35;

        if (num1==num2){
            System.out.println(num1 +" Equal " + num2);
        }

        if (num1 != num2){
            System.out.println(num1 + " is not equal "+num2);
        }

        if (num1 == num2) {
            System.out.println(num1 +" Equal " + num2);
        } else { //this else will presnent what ever left from first condition
            System.out.println(num1 + " is not equal "+num2);
        }

        // even numbers  -- if is number can be divided by 2 (if reminder is 0) then we call this number even number
        // odd numbers   -- if is number cant be divided by 2 (if reminder is not 0) this will be odd number

        //please create a java program that will check if number is even or odd number
        //if it is even print : number is even number
        //if it is odd number print number is odd number

        //20 even
        //25 odd
        int number=20;


        if (number % 2 ==0 ){ // true
            System.out.println(number +" is even number"); //it will print this one
        }else {//this else block will get exucte if if contions are not true
            System.out.println(number + " is odd number");
        }

    }
}
