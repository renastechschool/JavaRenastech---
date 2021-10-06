package day22_CustomClasses_StaticVariables;

public class Animals {

    String type;//instance variables
    double age;
    String name;
    String color;

    //cretea a method that will set all information for animal objects in one line
    public void setAnimalInfo(String type,double age , String color , String name){
        this.type=type;
        //if your method paramiters has same name with class variables
        //use this keyword to point your instance variable
        this.age=age;
        this.color=color;
        this.name=name;
    }

    //create a function that will explain what animal eats
    public void eating(String food){
        System.out.println(name + " is eating " +food);
    }

    //print type of animal
    public void getType(){
        System.out.println(name+ " is a " + type);
    }

    //to print our objets we will need to create a toString method
    public String toString(){
        return name + " - " + type + " - "+ age +  "-" + color;
    }
}
