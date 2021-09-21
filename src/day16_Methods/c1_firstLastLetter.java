package day16_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class c1_firstLastLetter {

    //create a java program that will ask for 5 string  name to store in the array
    //and print first and last letter from each string

    //example
    //input : berkan , firas ,merve ..
    //output : bn , fs ,me

    public static void main(String[] args) {
        //Scanner
        //String [] names
        //loop
        //charat

        Scanner input=new Scanner(System.in);

        //to store 5 names
        String [] nameList=new String[5];

       // nameList[0]=input.next();  5 times

        for (int i = 0; i <= nameList.length -1 ; i++){
            System.out.println("Enter Name " + (i+1) );
            nameList[i]=input.next();
        }

        System.out.println(Arrays.toString(nameList));

        String firstAndLAstLetter="";

        for (String eachName:nameList) {

            firstAndLAstLetter = "" + eachName.charAt(0)+eachName.charAt(eachName.length()-1);
            System.out.println(firstAndLAstLetter);
        }

    }
}
