package day14_Arrays;

import java.util.Scanner;

public class c1_arrayPractice {
    //test data
            //positve   1 -7 validate name presnet
           // negative  negatif number 0 or bigger 7
    //att1=false number and true
    //att1=false numebr false number true number
    //att1=false false false

    public static void main(String[] args) {
        //create a java program that will check days string and depends on number you passed
        //you should be able to see day name
        //example : 2 tue
        //3 :wed
        //numbers should be between 1 to 7 (included)
        //if numbers are not between 1 to 7 print invalid number
        //and give user 3 attempt if it is still not between 1 to 7 then stop whole system

        //variables
        //i will need string array for days name
        String []days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        //i will need int number to ask user to enter number
        //to enter number i will need a scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=scan.nextInt();
       // i will need an number that will check attempts
        int attempt=1;

       // conditions
        //check the number if number is not between 1 -7 invalid
                //need to check attempt after 3 stop
        while (number >7 || number <1){
            System.out.println("Invalid Number");
            System.out.println("Try Again !!");

            number = scan.nextInt();
            attempt++;

            if (attempt == 3 && (number >7 || number <1) ){
                System.out.println("user tried 3 times");
                System.out.println("System locked !!");
                System.exit(0);//this will stop all the class from running
            }

        }
        //check the number if it is between 1-7 print day name
        //1 mon (0) from array
        //2 tue (1) from array

        String result=days[number-1];
        System.out.println(result);



    }


}
