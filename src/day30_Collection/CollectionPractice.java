package day30_Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionPractice {
    //
/*
List and Set both are interfaces. They both extends Collection interface.
The important differences between set and list are:

1.Duplicate Objects
The main difference between List and Set is that List allows duplicates while
 Set doesn't allow duplicates.

2.Order
List is an ordered collection it maintains the insertion order,
which means upon displaying the list content it will display the elements in the same order in
which they got inserted into the list.

Set is an unordered collection, it doesn’t maintain any order.
 There are few implementations of Set which maintains the order
 such as LinkedHashSet (It maintains the elements in insertion order).
 treeset will sort
 hashset will sort in hashset logic

3.Null elements
List allows any number of null elements. Set can have only a single null elements at most.
--Treseet wont allow even one null
 */
    public static void main(String[] args) {
// 1. write a program that can remove the duplicated characters from String
        // and store them into variable

        String word= "Helloworldeeelll";

        String [] letters=word.split("");
        System.out.println(Arrays.toString(letters));

        //we can store our array in the collection
        //i will need to put in a set so i can remove all dublicates
        //insertion order matters (i dont want to sort )
        //Linkhasset
        LinkedHashSet<String> result= new LinkedHashSet<>(Arrays.asList(letters));
        //i cant use other sets because they will sort it

        System.out.println(result);

        //to put back in string

        String nonDublicateword="";

        for (String each : result){
            nonDublicateword += each;
        }

        System.out.println(nonDublicateword);


        // 2. write a program that can identify if two strings are build out of the same letters
        //String str1="abcabccabd";  //abcd
        //        String str2="dcbaccc";  //abcd

        //fisrt you will need to remove dublicate values so you can compare them
        //second make sure to sort them  from smallest to largest so you can compare if they are equal

        String str1="abcabccabd";
        String str2="dcbaccc";

        String [] arr1=str1.split("");
        String [] arr2=str2.split("");

        System.out.println(Arrays.toString(arr1));//[a, b, c, a, b, c, c, a, b, d]
        System.out.println(Arrays.toString(arr2));//[d, c, b, a, c, c, c]

        TreeSet<String> result1=new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> result2=new TreeSet<>(Arrays.asList(arr2));
        //treseet will take arrays and remove dublicates and sort them from smal to large

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        String newStr1=result1.toString();
        String newStr2=result2.toString();

        System.out.println(newStr1.equals(newStr2));

    }
}
