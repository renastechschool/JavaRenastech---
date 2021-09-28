package day18_MethodOverloading;

import java.util.Arrays;

public class c4_MethodOverloading {

    public static void main(String[] args) {
        int [] numbers={1,2,3,4};
        String [] names={"ridvan","Bahast","Musab"};
        char [] letters={'w','b','x','d','e'};

        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));

        System.out.println(concatination("hello", "world", "Java"));
        System.out.println(concatination("Java","Python"));

        //short cut to print with explanation is soutv
        System.out.println(Arrays.toString(numbers));
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

    }
    //task create method that concats 2 string
    //task create method that concats 3 string

    public static String concatination(String str1 , String str2) {
        return str1.concat(" " +str2);
    }
    public static String concatination(String str1, String str2,String str3){
        return str1.concat(" " + str2).concat(" "+str3);
    }
}
