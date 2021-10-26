package day29_Polymorphism.polymorphismPractice;

import MyUtil.util;

public class AnimalObjects {

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.eat();
        animal1.growing();
        animal1.animalMethod();

        util.stars();
        Fish fish1= new Fish("nemo" , 'm' , 20);
        fish1.eat();//result comes from fish
        fish1.growing();//result comes from fish
        fish1.swimming();//result comes from fish
        fish1.animalMethod();//result comes from animal

        util.stars();
        Animal animal2=new Fish("fish2" , 'f' ,5);
        animal2.eat();//result comes from fish
        animal2.growing();//result comes from fish
        animal2.animalMethod();//result comes from animal
        //animal2.swimming() method comes from fish cant be used animal object

        ///create objects for fox fish and animal

    }
}
