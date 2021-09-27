package day18_MethodOverloading;

public class c2_methodOverloading {

    public static void main(String[] args) {


        ////1. print sum of 2 int numbers
        //    //2. print sum of 3 int numbers
        //    //3. print sum of 2 double numbers

        sum(5,10 ,30);
        sum(5,10);
        sum(5.0,2.5);
    }
    public static void sumOf2NumbersInt(int a , int b){
        System.out.println(a+b);
    }

    public static void sum(int a ,int b){
        System.out.println(a+b);
    }

    public static void sum(int a ,int b ,int c){
        System.out.println(a+b+c);
    }

    public static void sum(double a,double b){
        System.out.println(a+b);
    }

}
