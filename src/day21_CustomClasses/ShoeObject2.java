package day21_CustomClasses;

import MyUtil.util;

import java.util.ArrayList;

public class ShoeObject2 {

    public static void main(String[] args) {
        Shoe shoe1=new Shoe();
        Shoe shoe2=new Shoe();

        shoe1.getShoeInfo();//null , 0 , null
        shoe2.getShoeInfo();//null , 0 , null
        util.stars();

//        shoe1.brand="addidas";
//        shoe1.size=10;
//        shoe1.color="yellow";
//        instead of calling each varibale
//        we can create a method under shoe class
//        that will assign our variables

        shoe1.setShoeInfo("adidas",10,"yellow");
        shoe1.getShoeInfo();
        shoe2.setShoeInfo("nike" ,7 ,"pink");
        shoe2.getShoeInfo();

        System.out.println(shoe1);//hashcode

        String [] shoelist={shoe1.brand, shoe2.brand};
        //since shoe.brand returns string i can store them in string array

        Shoe [] shoes={shoe1 ,shoe2};
        shoes[0].getShoeInfo();
        System.out.println("shoes[1].size = " + shoes[1].size);

        //how can we store in arraylist
        ArrayList<Shoe> shoeArrayList=new ArrayList<>();
        shoeArrayList.add(shoe1);
        shoeArrayList.add(shoe2);

        System.out.println(shoeArrayList); //to be able to see an result for this
        //your custom class needs to have a toString

    }
}
