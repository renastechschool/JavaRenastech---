package day28_Abstraction;

abstract  class  abstractClass1{
    public abstract void abstractMethod1(); //no body it needs be overriden

    public void method2(){
        System.out.println("method 2");
    }

}

public class c3_AbstractionPractice extends abstractClass1{
    //extands  will do inheritence logic
    //which means it will extend
    //abstrmethod1 and method2

    @Override
    public void abstractMethod1(){
        System.out.println( " abstract method in abstract practice class");
    }
}

abstract class abstractClass2 extends  abstractClass1 {
    //abstrac classes can have reguler method and abstract method
    //extedn abstract method and method2
  //public abstract void abstractMethod1();
    //public void method2(){body}

    abstract void abstractMethod3();
}

class class3 extends abstractClass2{
    //you cant have abstract methods in regular class
    //that is why extenedd abstract aree need be overriden

    //below methods will be inherited
    //abstractMethod3();  // needs to be overriden
    //abstractMethod1();  // needs to be overriden
    //method2(){body}  // no need to override because it has body (its not abstract method )
    @Override
    public void abstractMethod1(){

    }
    @Override
    public void abstractMethod3(){

    }





}
