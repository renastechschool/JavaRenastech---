package day20_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class c3_ArraysListMethods2 {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(100);
        list.add(35);
        list.add(-25);
        list.add(-100);

        //indexof(Object) will print index number of the object that you are passing
        //if that object is present in your list you will get index number
        //if object is not present you will get index as -1
        System.out.println(list.indexOf(100));//0
        System.out.println(list.indexOf(-25));//2
        System.out.println(list.indexOf(500));//-1
        System.out.println(list.indexOf(1));//-1

        int indexNum35=list.indexOf(35);
        System.out.println("indexNum35 = " + indexNum35);


        System.out.println("*********");

        ArrayList<String> list2= new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list2.indexOf("B")); //1
        System.out.println(list2.indexOf("c")); //-1

        //contains return boolean condition
        System.out.println(list2.contains("B"));

        //all the methods that we use with arraylist are returniing wrapperclasses
        //you can store them in either wrapper or primitive data type
        boolean b1=list2.contains("X"); // unboxing
        //list2.contains("X"); returns wrapper class

        System.out.println("b1 = " + b1);

        ///arrays .sort
        //Collections is an library whihc is very usefull with arraylist
        //Collection is data structure

        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        //equals method
        ArrayList<Integer> numList1=new ArrayList<>();
        numList1.add(10);
        numList1.add(20);

        ArrayList<Integer> numList2=new ArrayList<>();
        numList2.add(10);
        numList2.add(20);
        numList2.add(30);
        numList2.add(5);

        boolean bool=numList1.equals(numList2);
        System.out.println("bool = " + bool);

        //get method
        Collections.sort(numList2);
        System.out.println(numList2);
        for (int i =0 ; i < numList2.size() ; i++){
            System.out.println("numList2.get("+i+") = " + numList2.get(i));
        }

        //isempty
        numList2.clear();
        System.out.println("numList2.isEmpty() = " + numList2.isEmpty());

        //size
        System.out.println("numberList2.size() = " + numList2.size());


    }
}
