package MyUtil;

import java.util.Arrays;

public class util {

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result="";
        for (int i =name.length()-1 ; i >=0 ;i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }

    public static void hello(){//function of this method is to print hello
        System.out.println("Hello");
    }

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i =1 ; i <= 10 ; i++){
            System.out.println("Java");
        }
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
}
