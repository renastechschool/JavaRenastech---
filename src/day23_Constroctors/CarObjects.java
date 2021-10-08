package day23_Constroctors;

public class CarObjects {

    public static void main(String[] args) {
        //Car obj1=new Car();
        //without having any constructor i can still create an object from class
        //beacuse java will have default one

        Car obj2= new Car("bmw" ,2002,1250.5 ,"yellow");
        System.out.println(obj2);
        System.out.println("obj2.getBrandYear() = " + obj2.getBrandYear());

        Car obj3=new Car("toyota",2020);
        System.out.println("obj3.getBrandYear() = " + obj3.getBrandYear());

        System.out.println("obj3 = " + obj3);
    }
}
