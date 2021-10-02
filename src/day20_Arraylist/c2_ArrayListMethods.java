package day20_Arraylist;

import java.util.ArrayList;

public class c2_ArrayListMethods {

    //add
    //get
    //size

    //ArrayList<DataType> myNumbers = new ArrayList<Integer>(); // Valid

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();//size is 0
        //add method will add it to end
        numbers.add(5);//0
        numbers.add(10); //1
        numbers.add(100); //2

        System.out.println(numbers);//[5, 10, 100]

        numbers.add(0,20);//[20,5, 10, 100]
        System.out.println(numbers);

        numbers.add(2,30);//[20,5,30, 10, 100]
        System.out.println(numbers);

        //add(index , data)
        //this method will add your data to specific index that you want
        //numbers.add(7,33);  out of index
        int sizeOfNumbers= numbers.size();//last index is 4 and size is 5
        System.out.println("sizeOfNumbers = " + sizeOfNumbers);
        numbers.add(5,95);
        System.out.println(numbers);

        //set(index , data) //reassiginning your datas
        //this method will set value for given index
        //set 5 to 500
        numbers.set(1,500);
        System.out.println(numbers);

        ArrayList<String> letters = new ArrayList<>();
        System.out.println(letters);
        letters.add("B");//0
        letters.add("C");//1
        System.out.println(letters);

        letters.add(1,"A");//add
        System.out.println(letters);

        letters.set(2,"E");//reassign
        letters.add("A");
        System.out.println(letters);//[B, A, E, A]

        //remove
        letters.remove("A");
        System.out.println(letters);//[B, E, A]
        letters.remove(0);
        System.out.println(letters);//[E, A]

        letters.remove("X");
        System.out.println(letters);
        //remove method will look at given object or index to remove it if it is present it will removve
        //if it is not presnet nothing will change

        boolean b1=letters.remove("E");//true
        boolean b2=letters.remove("E");//false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        System.out.println(letters);

        //clear method will clear eveything in your list
        letters.clear();
        System.out.println("letters = " + letters);//[]

        if (letters.size() == 0){
            System.out.println("Clear method worked");
        }else {
            System.out.println("clear method is not working");
        }

    }
}
