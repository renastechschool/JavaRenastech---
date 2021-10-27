package day30_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class c3_Set {

    public static void main(String[] args) {
        //all type of sets are not going to accept dublicates

        //if you have the list of numbers that you dont want to store dublicate ones  which collection type you will use ?
        //set will be prefered

        Set<String> letters=new HashSet<>();

        //Hashset
        //accept null values
        //it doesnt accept dublicates
        //it has sort logic but it is not always from small to large
        letters.add("a");
        letters.add("a");
        letters.add("b");
        letters.add("e");
        letters.add("c");
        letters.add("d");
        letters.add("a");
        letters.add(null);

        System.out.println(letters);//[null, a, b, c, d, e]

        Set<String > letters2=new LinkedHashSet<>();
        //linkhasset
        //it doesnt accept dublicates
        //it does not sort
        //accept null values
        letters2.add("a");
        letters2.add("a");
        letters2.add("b");
        letters2.add("e");
        letters2.add("c");
        letters2.add("d");
        letters2.add("a");
        letters2.add(null);

        System.out.println(letters2);//[a, b, e, c, d, null]


        Set<String> letters3=new TreeSet<>();

        //Treseet
        //it doesnt accept dublicate values
        //it does not accept null values
        //it is going to sort from small to large
        letters3.add("a");
        letters3.add("a");
        letters3.add("b");
        letters3.add("e");
        letters3.add("c");
        letters3.add("d");
        letters3.add("a");
        //letters3.add(null);

        System.out.println(letters3);//[a, b, c, d, e]


        // //i want to store list of numbers in one collection type
        //             //that is not going to accept dublicates
        //             //also it will sort (from smallest to largest)

        //ideas ://treeset , arraylist (-) , priortyquee (-) ,hashset
        //arraylist : is not going work . Because it accept dublicate values
        //priortyquee : is not going work . Because it accept dublicate values
        //hashset  : may work but not always beacuse it has own sort logic

        //accept dublicate and keep insertion order
        //set wont work (set doesnt accept dublicates)
        //list and quee accept dublicates
        //any type of list will work and you can also use Dequee (not preferd)

        //i want to store list of numbers in one collection type
        //that is not going to accept dublicates
        //it will accept one null keyword

        //ideas : treeset , hashet ,linkhasset
        //since i dont want to accept dublicates only option left is set
        //and treset not accepting null
        //result is : hashset or linkhasset

    }
}
