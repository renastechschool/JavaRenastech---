package day28_Abstraction;

interface test1{
    void method1(); // public abstract
}
interface test2{
    abstract int method2(); // public abstract
}
interface test3{
    public abstract void method3(); // public abstract
}

public class c6_abstractionPractice2 implements test1,test2,test3{

    //it will inherite all the methods from test 1 ,test3 ,test 3
    //below method will be inherited from parent classes
    //met1 ,met2 ,met3
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 5;
    }

    @Override
    public void method3() {

    }
}

class test4{

}

class test5 extends  test4 {

}

//class test6 extends  test5 , test4{
//
//}


//differences between abstract class and interface
//A class can inherit from one class only (extends)
//A class can inherit multiple interfaces (implements)