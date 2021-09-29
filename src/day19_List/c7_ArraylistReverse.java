package day19_List;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class c7_ArraylistReverse {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add numbers from 1 to 8
        for (int i =1 ; i < 9 ;i++){
            list.add(i);
        }
        System.out.println(list);

        System.out.println("reverseArrayList(list) = " + reverseArrayList(list));
    }

    //creating a method that will print the arraylist in reversed order  8 to 1
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> numbers){
        //last index to first index
        ArrayList<Integer> reversedList=new ArrayList<>();
        for (int i =numbers.size()-1 ; i >=0 ; i--){
            reversedList.add( numbers.get(i) );
        }

        return reversedList;
    }
}
