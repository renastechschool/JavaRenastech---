package day15_ForEachLoop;

import java.util.Arrays;

public class c1_reverseSentence {

    ////create a condtion that will reverse given sentence
//        //ex: Java is fun
//        //output should be fun is java
////create a condtion that will reverse given string
//        //ex: Java is fun
//        //output should be nuf si avaJ

    public static void main(String[] args) {
        String sentence="Java is fun ";
        //fun is java
        String [] splitedSentence=sentence.split(" ");//[Java, is, fun]
        System.out.println(Arrays.toString(splitedSentence));

        String reverseSentence="";//store result from last index to first index
        for (int i = splitedSentence.length -1 ; i >=0 ; i--){
            reverseSentence += splitedSentence[i] + " ";
            System.out.println("in the loop " + reverseSentence);
        }

        System.out.println("+++++++++++++");
        System.out.println(reverseSentence);

        System.out.println("+++++++++++++");
        ////create a condtion that will reverse given string
//        //ex: Java is fun
//        //output should be nuf si avaJ
        String sentence2="Java is fun";
        String []splitedSentence2=sentence2.split("");//we split each letter and store into string array

        String reverseString2="";
        for (int i = splitedSentence2.length-1 ; i >=0 ; i --){
            reverseString2 += splitedSentence2[i];
        }

        System.out.println(reverseString2);

    }
}
