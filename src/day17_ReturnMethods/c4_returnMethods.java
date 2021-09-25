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

        boolean result = equalNames("hello" , "World");
        System.out.println(result);
    }

    //create a return method that will concat 2 different string
    public static String concatStrings(String name1 , String name2){ //name1=Mehmet , name2=Cakar
        //name1 = firstName2 ; name2=lastName2

        //name1 ="Mesut";  this will reassign your name to mesut
        return name1.concat(name2);
    }

    //    //create a logic that will check given names are equal
    //2 string to compare  2 parameters
    //to be able to compare you need equals
    //return type as boolean
    public static boolean equalNames(String str1,String str2){
        return str1.equals(str2);
    }


    ///what ever you want to have as a return make sure your method type is same as return
    //parameters are what ever you wanted to pass your method


}
