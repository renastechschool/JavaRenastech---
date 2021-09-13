package day10_ForLoop;

public class c3_forLoop2 {

    public static void main(String[] args) {

        //starting point :6
        //ending point : -1
        //iteration -1
        for (int i = 6 ; i > -2 ;i--){//6 5 4 3 2 1 0 -1 -2
            System.out.println("Mert");//6  5 4 3 2 1 0 -1
        }//5 4 3 2 1 0 -1 -2

        //starting point 0
        //ending point is 4
        //iteration -1
        //loop will be running until condidition gets false
        //if condition always true then your loop will be infinitive loop
//        for (int i=0 ; i <5 ; i-- ){//0 -1 -2
//            System.out.println("Meral");//0 -1  -2
//        }//-1 -2 -3 ..... -100 .. -1000

        //starting point 10
        //ending point is -1
        //iteration +1
//        for (int i= 10 ; i<0 ; i++){
//            System.out.println("Suphi");
//        }  0 times

//        //starting point 10
//        //ending point is 1
//        //iteration +1
//        for (int i= 10 ; i>0 ; i++){ //10 11 12 13
//            System.out.println("Suphi");
//        }//intinitive

        //starting point 10
        //ending point is 1
        //iteration -1
        for (int i= 10 ; i>0 ; i--){ //10 9 8 7 ...2 1 0
            System.out.println("Suphi");//10 9 8 7 6 5 4 3 2 1
        }//9 8 7 ... 2 1 0

        //create an condition that will print square numbers from 0 10
        //square of number means number * number
        //output
        // number0  0
        // number1  1
        // number2  4
        // number3  9
        //...
        // number10 100

        //starting point is 0
        //ending point is 10
        //iteration +1

        for (int number =0 ; number <=10 ; number++){ //0 1 2 3 4 10 11
            System.out.println("Number is : " +number );//0 /1 2
            int squareResult=number*number;//0 1 4
            System.out.println(" Square of Number is  : "+ squareResult); //0 to 10
                                        //0                                 0
                                        //..
                                        //10                                100
        }

    }
}
