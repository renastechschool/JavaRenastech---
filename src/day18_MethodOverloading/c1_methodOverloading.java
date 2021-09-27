package day18_MethodOverloading;

public class c1_methodOverloading {

    public static void main(String[] args) {

        method();
        method(10);//this has an int load
        method(10);
        method(20.0);

        byte b1=5;
        method(5); //int
        method(b1);  // byte

        //if you dont specify your variable type java will take it as a defult int for whole numbers
        //for decimel numbers will be double

        method("hello");
    }

    public static void method(){//this method doesnt have load it is without parameters
        System.out.println("Method ");
    }

    public static void method(int number){
        System.out.println(number + " int method");
    }

    //method overloading is creating everything same for method
    //only parameters type will be different
    //ex : same // Access-modifer       specifier        return-type        methodName
    // (paramater) needs to be diffrerent
    public  static void method(double number){
        System.out.println(number + " double method");
    }

//    public static void method(int number2){ will give you error because of first int method
//        System.out.println(number2 + " int method");
//    }

    public static void method(byte number){
        System.out.println(number + " byte method");
    }

    public static void method(String text){
        System.out.println(text+ " String method");
    }

}
