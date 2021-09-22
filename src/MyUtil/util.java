package MyUtil;

public class util {

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

    public static void hello(){//function of this method is to print hello
        System.out.println("Hello");
    }

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i =1 ; i <= 10 ; i++){
            System.out.println("Java");
        }
    }
}
