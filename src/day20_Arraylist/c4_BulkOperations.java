package day20_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c4_BulkOperations {

    public static void main(String[] args) {

        /*
        Bulk Operations:

        contailsAll(CollectionType):

        addAll(CollectionType):

        removeAll(CollectionType):

        retainAll(CollectionType):
        //
       */

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(2,3,4,5,6,10,0,11,500));
        System.out.println(numbers);//[2, 3, 4, 5, 6, 10, 0, 11, 500]

        Integer [] num1 ={ 0 ,1,2,3,5,10};
        numbers.addAll(Arrays.asList(num1));//[2, 3, 4, 5, 6, 10, 0, 11, 500, 0, 1, 2, 3, 5, 10]
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        //containsAll  this will check if objects are ccontains in the list
        System.out.println("numbers.contains(0) = " + numbers.contains(0));
        System.out.println("numbers.containsAll = " + numbers.containsAll(Arrays.asList(0, 1, 2, 333)));//false
        System.out.println("numbers.containsAll = " + numbers.containsAll(Arrays.asList(0, 1, 2, 3)));//true

        //removeall this will remove all the objects from the arraylist
        //remove will only remove first matching one

        ArrayList<Double> numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(1.0,1.0,1.0,2.5,3.5,3.0,3.0,3.0,3.0,3.0,3.0,10.3));
        System.out.println("numbers2 = " + numbers2);
        Double num=1.0;
        numbers2.remove(num); //this will remove first 1.0
        numbers2.remove(num); ////this will remove second 1.0
        System.out.println(numbers2);

        numbers2.removeAll(Arrays.asList(3.0));
        System.out.println(numbers2);

        //retainall  will search for given data ant it will keep them . others will be removed
        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,10));
        System.out.println("list5 = " + list5);

        list5.retainAll(Arrays.asList(5));
        System.out.println(list5);//[5, 5]


    }
}
