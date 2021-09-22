package day16_Methods;

public class c5_reverseString {

    public static void main(String[] args) {
        c3_Methods.hello();
        reverseString("hello world");
        String name1="Ridvan Oral";

        reverseString(name1);

        int i1=25;
        //reverseString(i1); we cant pass int here because parameter type of reverseString method is string
    }

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result="";
        for (int i =name.length()-1 ; i >=0 ;i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }
}
