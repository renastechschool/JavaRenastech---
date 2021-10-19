package day27_Exceptions;

public class c8_FinalVariables {

    //differences between finally and final keyword

    //finally is used with try catch block and it will get executed always

    //final keyword is used to make things not changable

      int instanVrble ;
      static int staticVrble;

      final int instanceVrble2=100;
      final static int staticVtble2=200;

    public static void main(String[] args) {
        staticVrble=100;
        c8_FinalVariables obj1=new c8_FinalVariables();
        obj1.instanVrble=200;

        //obj1.instanceVrble2=20;
        //staticVtble2=400;// final keyword will make variable not changable

        final int finalNumber=20;
        //number=22;

        int number1 = finalNumber; //20
        number1=1;

        System.out.println("finalNumber = " + finalNumber);
        System.out.println("number1 = " + number1);
        //number=2;
    }

}
