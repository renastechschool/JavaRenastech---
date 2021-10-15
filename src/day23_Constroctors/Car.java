package day23_Constroctors;

public class Car {
    //if you dont constructor  java will have one already
    //to give abilty to create an object from class

    String brand;
    int year;
    double price;
    String color;

    //to be able to set we were creating a set method
    public Car(String brand , int year){
        this.brand=brand;
        this.year=year;
    }

    public Car(String brand , int year , double price ,String color){
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;
    }
    //get car brand and year
    public String getBrandYear(){
        return brand+" - " + year;
    }

    @Override
    public  String toString(){
        return brand + " / " + year + " / "+ price + " / "+ color;
    }

}
