package day07_Scanner;

import java.util.Scanner;

public class c4_ScannerNext {

    public static void main(String[] args) {
        //for the strings to be able to use scanner you will need to call next method from librarry
        //2 way to create string scanner
        //next and nextLine

        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Name ");
        //String firstName="Ozer";
        String firstName=input.next();
        System.out.println("First name is " + firstName);

        System.out.println("enter last name ");
        String lastName = input.next();
        System.out.println("last name is "+ lastName);

        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("Grade for student ");
        int grade = input.nextInt();
        System.out.println(fullName + " grade is " + grade);


    }
}
