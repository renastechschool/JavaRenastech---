package study;

import java.util.Scanner;

public class asdas {



// welcome
        // first name last name (over 18) income
// do you want to become a member to the club
        // yes or no
        // answer yes name last name yearly income
        // over 200,000 then ask for gold member
        // gold membership get discount/ coupon 10%
        // asks for payment information
        // card num, exp, cvv
        // if correct then says "payment has gone through", if not, "will give an error"
        // will say "welcome to club mr or ms"

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the year");
            int year = input.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0)
                    System.out.println(year + " is a leap year");

            } else if (year % 4 == 0 || (year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year + " is not a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }


        }
    }
