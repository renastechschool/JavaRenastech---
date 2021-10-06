package day22_CustomClasses_StaticVariables;

public class CarObjects {

    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCarInfo("bmw",2020);

        System.out.println("car1.brandName() = " + car1.brandName());
       // brandName(); its instance method you can call with objt

        System.out.println("Car.isHasEngine() = " + Car.isHasEngine());
        //ishasengine is a static method no need to craete an object to call it
        //you can call by using classname


        //to print the object from class i need to create tostring method under car
        System.out.println(car1);

    }


}
