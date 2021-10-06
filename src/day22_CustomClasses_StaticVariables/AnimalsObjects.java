package day22_CustomClasses_StaticVariables;

import MyUtil.util;

import java.util.ArrayList;
import java.util.Arrays;

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

        Animals animal2=new Animals();
        animal2.setAnimalInfo("bird",3,"blue","bird1");

        Animals animal3=new Animals();
        animal3.setAnimalInfo("dog",5,"Black","dog1");

        //store animal object in the arraylist
        //data type of arraylist will be animal objects
        ArrayList<Animals> animalList=new ArrayList<>();
        animalList.addAll(Arrays.asList(animal1,animal2,animal3));

        String food1="banana";
        for (Animals each :animalList){
            util.stars();
            System.out.println(each.name);

            System.out.println(each);//since we dont have to string this will return you hashcode
            each.eating(food1);
        }

    }
}
