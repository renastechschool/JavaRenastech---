package day10_ForLoop;

public class c2_ForLoop {

    public static void main(String[] args) {

        //loops will help you on continues actions

        //in the loop
        //you will always need to specify
        //starting point
        //ending point
        //iteration

        //this for loop will be running until it reachs to ending point
        //start point is 0
        //end point is 10
        //iterartion is +1
        for (int i =0 ; i<=10 ; i++ ){ // i = 0 ,1,2,3,4,5,6,7,8,9,10
            System.out.println("Hello world");//0 ,1 ,2  -- 11 times
        }//i=1,2

        //start point is 0
        //end point is 7
        //iterartion is +2
        for (int i =0; i<8 ; i+=2){//0 2 4 6 8
            System.out.println("java");//0 2 4 6 -- 4 times
        }//2 4 6 8

        //start point is 1
        //end point is 10
        //iterartion is +3
        for (int k=1 ; k <=10 ; k+=3 ){ //1 4 7 10 13
            System.out.println("Bahast");//1 4 7 10  -- 4 times
        }//4 7 10 13


    }
}
