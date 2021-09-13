package day04_ifStatements;

public class c5_ifStatement {

    public static void main(String[] args) {

        boolean bool1 = 10 > 5;//true
        boolean b2 = 10 == 12; //false

        if (2 > 2) {//openiing bracket for if //false
            //if if condition is false java will not check inside if statemnt
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
        }//closing bracket for if
        System.out.println("Java");

        if (1==1){ //true
            //if if stament is true java will go inside of if stament and excute the code
            System.out.println("World");
            System.out.println("World");
            System.out.println("World");
        }

        if (b2){//false
            System.out.println(b2);//this wont be printed
        }

        if (true){// if is true java will exucte inside if statement
            //inside if
            System.out.println("b2 is " + b2); // b2 is false
        }


    }//closing bracket for main
}//closing bracket for the class
