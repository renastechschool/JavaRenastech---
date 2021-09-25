package day17_ReturnMethods;

import java.util.Scanner;

public class c4_returnMethods {

    public static void main(String[] args) {
        String firstName="Hello";
        String lastName="World";

        System.out.println(firstName.concat(lastName));

        System.out.println(concatStrings("Mehmet","Cakar"));

        Scanner input=new Scanner(System.in);
        String firstName2=input.next();
        String lastName2=input.next();

        System.out.println(concatStrings(firstName2,lastName2));

    }

    //create a return method that will concat 2 different string
    public static String concatStrings(String name1 , String name2){ //name1=Mehmet , name2=Cakar
        //name1 = firstName2 ; name2=lastName2

        //name1 ="Mesut";  this will reassign your name to mesut
        return name1.concat(name2);
    }
}
