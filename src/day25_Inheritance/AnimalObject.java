package day25_Inheritance;

public class AnimalObject {

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.age=10;
        animal1.name="animal1";
        animal1.color="black";
        animal1.eat("sugar");
        animal1.grow();
        animal1.move();
        System.out.println("animal1.age = " + animal1.age);

        Bird bird1=new Bird();
        bird1.age=5;
        bird1.name="bird1";
        bird1.grow();
        bird1.move();

        bird1.fly();

        //animal1.fly();
        //animal1 is object that comes from Animal class
        //does animal class has fly method == no
        //so you cant use fly method

        bird1.eat("bread");
        //bird1 is object that comes from Bird class
        //does bird class has eat method  == yes it has
        //it is taking from parent which i animal
        //inheritence will help child class to have whatever you have in the parent.


        Fox fox1=new Fox();
        fox1.name = "fox1";
        fox1.color="Brown";
        fox1.age=3;
        fox1.weight=20;

        fox1.eat("cheese");
        fox1.grow();
        fox1.move();
        fox1.smileFox();

       // bird1.smileFox();

        System.out.println(bird1);
        System.out.println(fox1);
        System.out.println(animal1);
        //....
    }
}
