package day14_Arrays;

import java.util.Arrays;

public class c3_MinMaxStirng {

    public static void main(String[] args) {
        //task3
//write a program that can return the largest string of text from an array
//ex         String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex         String[] names = {"hello", "world", "java", "pyton", "JS" "sevgin", "renastechschool"};
//output : JS

        String [] names={"hello", "world", "java", "pyton", "sevgin", "renastechschool", "JS"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //in assci table
        //A 65      a  97
        //Z 90      z  122

        //lets assume first word has max length
        //lets assume first word has min length

        int maxLength=names[1].length();
        int minLength= names[1].length();

        //lets assume largest and shorttest string
        String longestName= names[1];
        String shortestName= names[1];


        for (int i =0 ; i < names.length ; i++){

            if (names[i].length() >= maxLength){
                maxLength= names[i].length();
                longestName = names[i];
            }

            if (names[i].length() <= minLength){
                minLength = names[i].length();
                shortestName = names[i];
            }
        }

        System.out.println(longestName);
        System.out.println(shortestName);


    }
}
