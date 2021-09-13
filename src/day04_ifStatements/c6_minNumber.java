package day04_ifStatements;

public class c6_minNumber {

    // 3  different   variable
    //x=400 y=200 z=300
    //x=100 y=200 z=300
    //x=300 y=100 z=400

    //output should be minumum number is 200

    //if x is the minumun that measn x < y and x < z
    //if y is the minumun that measn y < x and y < z
    //if z is the minumun that measn z < x and z < y

    //3 if statement to check which boolen is true

    public static void main(String [] args){
        int x= 1500;
        int y= 1200;
        int z= 1300;


        boolean xMin= x<y && x<z; // 500 <200 && 500<300 //false
        boolean yMin= y<x && y<z; // 200<300 && 200<500 //true
        boolean zMin= z<x && z<y; // 300<500 && 300 <200 //true && false //false

        if (xMin){//false
            System.out.println("Minumum number is "+ x); // it wont print this one
        }

        if (yMin){//true
            System.out.println("Minumum number is " + y );//this will be printed
        }

        if (zMin){//false
            System.out.println("Minumum number is "+ z);//it wont print this one
        }

    }
}

