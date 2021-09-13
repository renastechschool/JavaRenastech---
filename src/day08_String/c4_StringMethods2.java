package day08_String;

public class c4_StringMethods2 {

    public static void main(String[] args) {

        //equals()	          Compares two strings. Returns true if the strings are equal,
        //                      and false if not	                                                boolean
        //equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean

        String word1="Hello";
        String word2="Hello"; //this will be under pool memory
        String word3=new String("Hello"); // this will be under heap memory
        String word4=new String("Hello");
        String word5="Java";

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word2.equals(word3));
        System.out.println(word3.equals(word4));
        System.out.println(word1.equals(word5));
        System.out.println("*****************");
        System.out.println(word1 == word2);
        System.out.println(word1 == word3);
        System.out.println(word2 == word3);
        System.out.println(word3 == word4 );
        System.out.println(word1 == word5);

        //equals method will only care exact match
        //it wont check how variable gets created
        //== operator will also check how variable created

        //equalsIgnoreCase()	  Compares two strings, ignoring case considerations	     boolean

        String str1="Java";
        String str2="java";
        String str3="JAvA";

        System.out.println("*****************");
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println("*****************");

        boolean b1=str1.equalsIgnoreCase(str3);// true
        boolean b2=str1.equals(str2);           //false
        boolean b3=str3.equalsIgnoreCase(str1); //true

        if (b1){//true java will check inside this if condition
            System.out.println("b1 is true"); //this line will be excuted
            if (b2){//false since if cond. is false jawa wont check inside this if
                System.out.println("b2 is true ");
                if (b3){
                    System.out.println("b3 is true");
                }else {
                    System.out.println("b3 is false");
                }
            }else { // true
                System.out.println("b2 is false"); //this line will be also excuted
            }
        }else{
            System.out.println("b1 is false");
        }

    }
}
