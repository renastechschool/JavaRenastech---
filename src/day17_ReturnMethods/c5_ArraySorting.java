package day17_ReturnMethods;

import MyUtil.util;

import java.util.Arrays;

public class c5_ArraySorting {

    public static void main(String[] args) {
        int [] numbers = {5,19,2,-3,10};
        Arrays.sort(numbers);
        //classname.method
        System.out.println(Arrays.toString(numbers));

        //classname.method
        util.hello();

        int [] numbers2 = {3,10,5,7,20,100,0};
        descendingSort(numbers2);

        util.descendingSort(numbers2);

        System.out.println("****************");
        System.out.println(Arrays.toString(descandingOrder2(numbers2)));
    }

    //create a method that will print array in descending order
    public static void descendingSort(int [] arr){
        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];
            lastIndex--;
           // descArr[0]=arr[lastIndex];
           // descArr[1]=arr[lastIndex-1];
           // descArr[2]=arr[lastIndex-2];
           // descArr[3]=arr[lastIndex-3];

        }

        System.out.println(Arrays.toString(descArr));
    }

    ////create a return method that will print array in descending order
    ///logic is to take an array an return that array in descending order
    //that means my return is int []

    public static int [] descandingOrder2(int [ ] arr){
        System.out.println("hello descanding");

        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];
            lastIndex--;
            // descArr[0]=arr[lastIndex];
            // descArr[1]=arr[lastIndex-1];
            // descArr[2]=arr[lastIndex-2];
            // descArr[3]=arr[lastIndex-3];

        }

        System.out.println(Arrays.toString(descArr));

        return descArr;
    }


}
