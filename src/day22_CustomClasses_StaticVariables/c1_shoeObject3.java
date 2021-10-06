package day22_CustomClasses_StaticVariables;


import MyUtil.util;
import day21_CustomClasses.Shoe;

import java.util.Arrays;

public class c1_shoeObject3 {

    public static void main(String[] args) {
        //to be able create an object from shoe class i need to call my class and import in this class

        Shoe shoe1=new Shoe();
        //to be able to use any variable or method under Shoe class you will need an object
        shoe1.wear();
        System.out.println("shoe1.toString() = " + shoe1.toString());

        shoe1.setShoeInfo("puma",5,"red");
        shoe1.getShoeInfo();
        System.out.println(shoe1); //this object will read tostring method
        //if you dont have tostring method under shoe it will give you hashcode
        System.out.println(shoe1.size);

        Shoe shoe2=new Shoe();
        shoe2.setShoeInfo("converse",13,"yellow");

        Shoe [ ] shoes={shoe1,shoe2};
        System.out.println(Arrays.toString(shoes));

        util.stars();
        for (int i=0 ; i < shoes.length ; i++){
            //print wear for each shoe
            shoes[i].wear();
            shoes[i].getShoeInfo();
        }

    }
}
