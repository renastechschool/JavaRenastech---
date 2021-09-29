package day19_List;

import java.util.ArrayList;

public class c6_ListPractice {

    //create an list of Integers
    //add 4 numbers
    //return maximumnumber

    public static void main(String[] args) {
        ArrayList<Integer> numberList=new ArrayList<>();
        numberList.add(200);
        numberList.add(100);
        numberList.add(0);
        numberList.add(55);
        numberList.add(290);
        numberList.add(-100);

       // int maximum=numberList.get(0); //assuming number 0 is maximuum
        int maximum=Integer.MIN_VALUE;//-2147483648  //we assume min int number is max
        System.out.println(maximum);

        //create a for loop to compare my list with maximum number
        //if its bigger i will reassigned to max
        for (int i=0; i < numberList.size() ; i++){
            if (numberList.get(i) > maximum){
                maximum = numberList.get(i);
            }

        }

        System.out.println(maximum);

        //create a logic to print minumum

        System.out.println("minNumber(numberList) = " + minNumber(numberList));
    }

    public static Integer minNumber(ArrayList<Integer> list){
        //Integer minumum= list.get(0); assuming index 0 is minumum
        Integer minumum= Integer.MAX_VALUE;//2147483648
        System.out.println("First minumum = " + minumum);

        for (int i =0 ; i < list .size() ; i++){
            if (list.get(i) < minumum){
                minumum = list.get(i);
            }
        }

        return minumum;

    }
}
