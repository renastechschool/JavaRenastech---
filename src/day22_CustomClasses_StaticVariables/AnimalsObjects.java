package day22_CustomClasses_StaticVariables;

public class AnimalsObjects {

    public static void main(String[] args) {
        Animals animal1=new Animals();
        System.out.println(animal1.type);//null

        //animal1.type="cat"; //instead  of calling each variable i can just call set method to set all variables
        animal1.setAnimalInfo("cat",10,"black","cat1");
        System.out.println(animal1.type);//cat
        animal1.getType();//cat1 is a cat

        animal1.eating("bread");
        animal1.eating("fish");

    }
}
