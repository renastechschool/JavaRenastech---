package day17_ReturnMethods;

import java.util.Arrays;

public class c1_UniqueLetterFromArray {
    //Write a program that can print out the unique values from a String Array
    //            Ex:
    //                if arr -> {"A", "A", "B", "C", "C"}
    //                output: B
    //
    //                if arr -> {"A", "B", "B", "C"}
    //                output:  A
    //                         C
    // */

    //the ones only availbe in array for one time will be unique
    //count of string ,letter will be only one
    //i should only print letters that has count==1
    //to check letter count you will need to compare with all letters and when it equals count will be increased
    //count 1 are unique
    //count 2,3,4,5 .... are not unique

    public static void main(String[] args) {
        String [] letters = {"A", "A", "B",  "C","D","D"};

        for (String eachLetter : letters){ //"A"  ,, "B"
            int count=0;
            for (String eachletter2:letters){//"A", "A", "B",  "C","D","D"
                if (eachletter2.equals(eachLetter)){
                    count++;//1 2 3
                }
            }

            if (count==1){
                System.out.println(eachLetter);
            }
        }

        System.out.println("*******************");
        String [] arr={"A", "B", "B", "C"};
       // String [] arr2={"A", "B", "B", "C"};

        uniquesFromArray(arr);
       // uniquesFromArray(arr2);

        uniquesFromArray2(arr);

    }

    public static void uniquesFromArray(String [] letters){

        //String [] letters = {"A", "A", "B",  "C","D","D"};
        //no need this one because we want make sure to run this method for different String arrays

        for (String eachLetter : letters){ //"A"  ,, "B"
            int count=0;
            for (String eachletter2:letters){//"A", "A", "B",  "C","D","D"
                if (eachletter2.equals(eachLetter)){
                    count++;//1 2 3
                }
            }

            if (count==1){
                System.out.println(eachLetter);
            }
        }
    }

    public static void uniquesFromArray2(String [] letters){

        //String [] letters = {"A", "A", "B",  "C","D","D"};
        //no need this one because we want make sure to run this method for different String arrays

        System.out.println(Arrays.toString(letters));

        for (int i=0 ; i < letters.length ; i++){//A

            int count=0;
            for (int i1 =0 ; i1 < letters.length ; i1++){//{"A", "A", "B",  "C","D","D"};

                if (letters[i1].equals(letters[i])){
                    count++;
                }
            }


            if (count==1){
                System.out.println(letters[i]);
            }
        }

    }


}
