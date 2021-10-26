package day29_Polymorphism;

public class Abstraction extends  test3 implements test1,test2{


    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public void method3() {

    }
}

interface test1{
    void method1();//public abstract
    String method2();//public abstract

    int number=100;//public static final
}
interface test2{

}

abstract class test3{
    public abstract void method3();
    public void method4(){

    }
}