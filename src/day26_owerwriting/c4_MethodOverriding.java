package day26_owerwriting;


class test5{
    int number ;
    public void method2(){
        System.out.println("Method 2");
    }
}


public class c4_MethodOverriding extends test5{
    //after extending method2 will be inheirted


    //overloading means same method name with different loads
    public void method1(int number){

    }

    public void method1(String str){

    }

    @Override
    public void method2(){
        System.out.println("owerwrite method2");
    }

    public void hello(String str,String str2){

    }

    public static void main(String[] args) {

        c4_MethodOverriding obj = new c4_MethodOverriding();
        obj.method2();
    }
}


//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//				less memory
//				easy to memorize
