package day20_Arraylist;

import java.util.Arrays;

public class c1_SumDigitsFromString {

    public static void main(String[] args) {
         /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */

        String text= "he3llo 505 wor6ld a1b2c3";
        //int numbers= Integer.parseInt(text); this wont work if you have letters in the string
       // System.out.println(numbers);

        String text2="5";
        int num = Integer.parseInt(text2);
        System.out.println(num);

        int sum=0;
        int sum2=0;
        //we will need to store each letter to be able to check if they are number

        char [] allCharacters=text.toCharArray();
        System.out.println(Arrays.toString(allCharacters));


        for (char each : allCharacters){

            if (each >= 48 && each <=57){//this character is between 0123456789
                sum += Integer.parseInt(""+each);
            }

            if (Character.isDigit(each)){
                sum2 += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);
        System.out.println("sum2 = " + sum2);

    }
}
