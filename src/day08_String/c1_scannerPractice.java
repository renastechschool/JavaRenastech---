package day08_String;

import java.util.Scanner;

public class c1_scannerPractice {


    public static void main(String[] args) {
        //to be able to use library we will n eed to create an object from class
        Scanner input = new Scanner(System.in);

        System.out.println("Employee First Name ");
        String firstName=input.next(); // next will only accept one word
        System.out.println("First name is : " + firstName);

        //to handle enter that comes after next use below line
        input.nextLine();

        System.out.println("Full name of Employe " );
        String fullName=input.nextLine();//will accept enter
        System.out.println("full name is "+fullName);

        System.out.println("Employe Company Name");
        String companyName=input.nextLine();//will accept enter
        System.out.println("Company name is " + companyName);

        System.out.println("enter Employe Age ");
        int age = input.nextInt();
        System.out.println("Age is "+age);

        //after passing age and clickling enter will be accepted on nextline
        input.nextLine();//handle enter after passing age

        System.out.println("enter Employee city ");
        String city=input.nextLine();
        System.out.println("City name " + city);

        System.out.println("Enter salary of employee ");
        double salary=input.nextDouble();
        System.out.println("Salary is "+salary);

    }

}
