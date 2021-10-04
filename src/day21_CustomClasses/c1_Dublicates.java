package day21_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c1_Dublicates {

    //write a java program that will return dublicate datas from an arraylist
    //input list1 {1,2,3,4,5,1,2,10}
    //output 1,2
    //input list2 {a,b,c,d,c,x,e ,c ,d ,x,x}
    //c ,d ,x

    //to be able to print dublicate data i will need to check count of data
    //whihc has to be bigger then 1 count >1 --- this will be dublicate

    //if count == 1 unique

    public static void main(String[] args) {

        ArrayList<String> letters=new ArrayList<>();
        letters.addAll(Arrays.asList("a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"));
        //    //c ,d ,x as a results

        ArrayList<String> dublicatedList= new ArrayList<>(); // we will store dublicate ones in this list

        //if count is more then 1 that means data is dublicated

        for (int i =0 ; i<letters.size();i++){//"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"

            int count =0 ;
            for (String each : letters){////"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"

                if (each.equals(letters.get(i))){
                    count++;//1 2 3
                }
            }

            if (count > 1 && !dublicatedList.contains(letters.get(i))){ //true && true
                System.out.println(letters.get(i) + " count is "+ count);
                dublicatedList.add(letters.get(i));//c d  x
                System.out.println("dublicatedList = " + dublicatedList);
            }

        }

        System.out.println(dublicatedList);


        System.out.println("dublicateValues(letters) = " + dublicateValues(letters));
    }

    public static ArrayList<String> dublicateValues(ArrayList<String> list){
        //Collections is an library that has some ready methods
        //count

        //result in dublicated arraylist
        ArrayList<String>dublicatedList=new ArrayList<>();

        for (int i =0 ; i<list.size();i++){//"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"

            int count = Collections.frequency(list,list.get(i));
            // list ==//"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"
            //list geti =a ,b
            //frequency will take 2 parameter
            //first one is your arraylist
            //second one one data from your list
            //
            System.out.println("count of list.get(i) = " +list.get(i) + " == " + count  );

            if (count>1 && !dublicatedList.contains(list.get(i))){
                dublicatedList.add(list.get(i));
            }

        }

        return dublicatedList;

    }


}



