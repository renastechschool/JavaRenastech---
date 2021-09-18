package day14_Arrays;

import java.util.Arrays;

public class c5_StringMethods {

    public static void main(String[] args) {
        //Another String method
        //toCharArray()

        //Method	              Description                                                     	Return Type
        //toCharArray()             this will take a string and return you a char array	             char[]

        String str= "*& Java  12 Ghost ESther";
        char [] letters= str.toCharArray();
        System.out.println(letters [ 3]);
        System.out.println(Arrays.toString(letters));//[*, &,  , J, a, v, a,  ,  , 1, 2,  , G, h, o, s, t,  , E, S, t, h, e, r]
                                                    // 0   1  2  3  4  5  6  7
        System.out.println(letters[7]);



        //string method
        //split()
        //this will split given string from specific condition in the string     Return Type
        //      	                                                                string[]

        String mySentence="Java is fun";

        //task is to split sentence from spaces
       // String [] splitedSenteces=mySentence.split(" "); // to split from spaces
       // String [] splitedSenteces=mySentence.split("a"); //to split from a letter
        String [] splitedSenteces=mySentence.split("");  //to split from each letter
        System.out.println(Arrays.toString(splitedSenteces));


        //tochararray vs split
        //split is more specific to split anywhere you want to
        //split retruns string array tochararray returns char array

    }
}
