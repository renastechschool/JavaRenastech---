package day08_String;

//import java.lang.String; no need to import beacause java will import automaticlly

public class c2_StringClass {

    public static void main(String[] args) {

        //to create a string
       // String str="Hello";

        /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            2.By new keyword
 */
        //create an string object 1.By string literal
        //Java String literal is created by using double quotes. For Example:
        //
        //String str1="Hello";
        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        //for example :
        String str1="Hello";// 1.By string literal java will check pool and since we dont have "Hello"
        // in the pool memory java will create new string under pool memory
        String str2="Hello";// 1.By string literal this wont create a new instance under pool memory
        //because if string already excist in the pool , a reference to the pooled instance will be returned

        //to reason of java use string literall logic is to make java memory more efficient


        //2.by new keyword
        String str3=new String("Hello");
        //it will create an object called Hello under java heap memory (non -pool )


        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        //we have 2 different objects and those 2 object created under different memory


        //what is the difference of == and equals


        String s1="New York"; //placed under string pool
        s1="Virginia"; //new object will be placed as virginia
        //s1 references will change to virgina


        //in java  string objects are immutable
        //immutable means object is uncahangabel (can not be modify)

        String s2="New York";

    }
}
