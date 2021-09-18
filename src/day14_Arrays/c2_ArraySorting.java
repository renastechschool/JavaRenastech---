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


        //largest to smallest
        //create a condition that will print the numbers from largest to smallest
        int []arr={100,2,5,16,27};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //if i also want to store from large to small
        int [] largeToSmall=new int[arr.length];// [0 ,0 , 0 , 0 , 0]

        //largeToSmall[0] == arr [lastindex]
        //largeToSmall[1] == arr [lastindex-1]
        //..

        //to print from largest
        //my loop will need to start from last index
        //end point = 0 first index
        //iteration --

        int j=0;
        for (int i = arr.length-1 ; i >= 0 ; i-- ){ //last last -1

            //System.out.println(arr[i]);
            System.out.println(j +" j"    + " ,, i "+i);
            largeToSmall[j] = arr[i];
            //largeToSmall[0] == arr [lastindex]
            //largeToSmall[1] == arr [lastindex-1]
            //..
            j++;//1
        }

        System.out.println(Arrays.toString(largeToSmall));



    }
}
