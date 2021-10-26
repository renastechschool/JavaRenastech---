package day29_Polymorphism.polymorphismPractice;

public class Fish extends Animal{

    //
    ////create a fish class that extends Animal   -- inheritence
    ///belows will be inherited
    //age,gender
    //eat,grow,animalMethod

    ////create a constructor that will take fishname,gender and age

    ////owerwrite methods eat grow for fish
    ////create a swim method for fish

    public String fishName;

    public Fish(String fishName, char gender , int age ){
        this.fishName=fishName;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public void eat(){
        System.out.println(fishName + " is eating ");
    }
    @Override
    public void growing(){
        System.out.println(fishName + " is growing and age of fish is : " + age);
    }

    public void swimming(){
        System.out.println(fishName + " is swimming ");
    }
}
