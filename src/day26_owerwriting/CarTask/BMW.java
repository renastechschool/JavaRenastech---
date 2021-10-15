package day26_owerwriting.CarTask;

public class BMW  extends Car{
    //start and stop will be inherited

    //    //method overriding: same method name, same parameter, same return-type  (MUST)
    ////				   MUST happen in the sub class
    ////				   access modifer MUST be same or more visible
    ////				   ONLY the instance methods can be overridden
    ////				   @Override annotation MUST be applicable
    ////

    @Override
    public void startCar(){
        System.out.println("BMW Started");
    }


}
