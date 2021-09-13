package day05_Ifcontinue;

public class c3_MultiIfStatements {

    // you will prefer to use multi if statements if you have more then 2 conditions

    public static void main(String[] args) {

        //check 2 numbers
        //first check if they are equal
        //second check is one of them bigger
        //last condition is smaller

        int x= 25;
        int y= 35;

        if (x == y){ // java will check this block first
            System.out.println(x+" equal to " + y);
        }else if (x>y){ //it will check this one as a next step
            System.out.println(x+ " is bigger then " + y);
        } else { // if both of if is not true then it will print this else
            System.out.println(x + " is smaller then " +y);
        }

        // else will cover what ever left from if and if else conditions
        // it will be very at the end


        // starting point is 0                                      print  you are at starting point
        // ending  point  is 10                                     print  you are at ending point
        // between those numbers (0-10) will be  on my way          print  you are on your way
        // anything left will be wrong way                          print some warning mesegaes

        int point = 190;

        if (point == 0) {  // covered 1 scnerio which is 0
            System.out.println("You are at starting point");
        }else if (point == 10){ // covered 1 scnerio which is 10
            System.out.println("You are at ending point");
        }else if (point > 0 && point < 10){//  1 2 3 4 5 6 7 8 9  -- 9 scnerio
            System.out.println("You are on your way");
        }else { // all other numbers left will be covered under this else block
            System.out.println("You are on wrong way");
            System.out.println("Please check your point " + point);
            System.out.println("Point has to be between 0-10");
        }


    }
}
