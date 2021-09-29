package day19_List;

import java.util.ArrayList;

public class c5_List {

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects

    // ArrayList<DataType>  listName = new ArrayList<DataType>();
    //DataType can not be primitive
    //they need to be wrapper class ,object

    //ArrayList: part of Collections
    //			does not support primitives, only support none primitives
    //			size is dynamic, automatically adjusted
    //			has index numbers

    //what is the differences between array and array list
    //1.size  : array size is fixed and ; arrraylist size is dynamic
    //2.array accepts primitives arraylist doesnt accept primitives
    //3.array is data structure and arraylist is part of collection data structure

    public static void main(String[] args) {
        // ArrayList<DataType>  listName = new ArrayList<DataType>();
           //ArrayList <int>        list1    =new ArrayList<int>(); collections doesnt accept primitives
           ArrayList <Integer>        list2    =new ArrayList<Integer>();
           //size of list 2 is 0 for now and this size is flexible

        //add() this method will add data to your list
        list2.add(25); //size 1 index 0
        list2.add(55); //size 2 index 1
        list2.add(100); //size 3 index 2
        list2.add(200); //size 4 index 3

        System.out.println(list2);

        int [] numbers=new int[10]; //size is fixed 10

        //get() that will give you specific number from list
        Integer numIndex1=list2.get(1);
        System.out.println("numIndex1 = " + numIndex1);
        System.out.println(list2.get(3));
       // System.out.println(list2.get(4));//IndexOutOfBoundsException

        //list2.get(0); // will return 25 as wrapper object

        int number0=list2.get(0);
        //unboxing will hep us to store wrapper objectt to primitive data type
        System.out.println(number0);


        ArrayList<String> nameList=new ArrayList<>(); //size 0
        nameList.add("Meral");
        nameList.add("Recep");
        nameList.add("Musab");
        nameList.add("Bawer");//size 4 index 3

        System.out.println(nameList);


        //size() will give us size of arraylist
        System.out.println("Size of namelist is "+ nameList.size());
        System.out.println("Names are : ");
        for (int i=0 ; i <= nameList.size() -1 ; i ++){
            System.out.println("nameList.get("+i+") = " + nameList.get(i));
                                                        //namelist[i]
        }

        nameList.add("ridvan"); //size 5 index 4
        nameList.add("Jessica");

        System.out.println(nameList.size());
    }
}


//add
//get
//size