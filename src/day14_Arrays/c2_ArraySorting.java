package day14_Arrays;

import java.util.Arrays;

public class c2_ArraySorting {

    public static void main(String[] args) {
        int [] numberList={2,3,10,-55,209,100,7,9,10,100};
        System.out.println(Arrays.toString(numberList));//{2,3,10,-55,209,100,7,9,10,100};

        Arrays.sort(numberList);

        System.out.println(Arrays.toString(numberList));//[-55, 2, 3, 7, 9, 10, 10, 100, 100, 209]
                                                        //[-55, 2, 3, 7, 9, 10, 10, 100, 100 ]

        //print the min number
        //after sorting your min number will be always your first number from array
        System.out.println("Min Number is "+ numberList[0]);

        //max number from list
        //will be last index since we sorted
        //whihc is lenght -1
        System.out.println("Max Number is "+ numberList[numberList.length-1]);

        //medium number
        //first you will need to check if number can be divided by 2
        System.out.println("Medium number is " + numberList [numberList.length /2 ]);


    }
}
