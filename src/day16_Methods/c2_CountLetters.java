package day16_Methods;

import java.util.Arrays;

public class c2_CountLetters {
    // create a java logic that will count letter a or A from given string
    //example
    //JavA
    //output should be 2

    public static void main(String[] args) {
        //string
        //tochararray split
        //count variable int
        //for each

        String  sentence="Java is best , JavA is fun , Python is Also fun, Hello world";
        //sentence.toLowerCase();

        String [] letters=sentence.split("");

        System.out.println(Arrays.toString(letters));


        int countLetterA=0;

        for (String eachLetter : letters ){
            if (eachLetter.equalsIgnoreCase("a")){
                countLetterA++;
            }
        }

        System.out.println("Count of A is "+countLetterA);
    }
}
