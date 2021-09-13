package day07_Scanner;

import java.util.Scanner;

public class c1_ScannerClass {


    public static void main(String[] args) {


        //first of all scanner is a librarry under java
        //libraries has ready methods created inside of librarry
        //to be able to use any librarrry we need call them in our class
        //and create object from that librarry
        Scanner input = new Scanner(System.in);
        //I called  scanner class (ready librarry under java) and created an object called input
        //to be able to crreate object we nedd to create new Scanner

        //to import librarry
        //move your mouse on red line
        // click on option + enter  for mac
        //click on alt + enter for windows

        //to go to librray hold on ctrl or command then click on library name

        System.out.println("Insert your byte number");
        byte b1 = input.nextByte();
        //nextbyte method will ask user to enter a number and then it will acccept that number and assigned to b1 variable
        System.out.println(b1);

        System.out.println("enter int number");
        //to be able to use librarry methods you need to call the object
        int numberInt=input.nextInt();
        System.out.println("Number int is " + numberInt);


        Scanner scan=new Scanner(System.in); //this is anothor object comes from Scanner class
        //name of object is scan
        System.out.println("enter short number");
        short numberShort=scan.nextShort();
        System.out.println(numberShort);


    }
}
