package day10_ForLoop;

public class c6_breakStatements {

    public static void main(String[] args) {

        for (int i =1 ; i <=10 ;i++){//1 2 3 4  5
            System.out.println("Java");//1 2 3 4 5 6 7 8 9 10

            if (i==4){ //4
                System.out.println("Java2");//4
            }

        }

        System.out.println("*****************************************");
        //break statment
        //anytime java will reach to break statment it will stop current condition that you have
        //if java cathcs break inside the loop
        //loop will be stopped from running
        //anything after break statemtn wotn be excuted
        for (int i = 1 ; i <=5 ;i++){//1 2 3
            System.out.println("Hello");//1 2 3

            if (i==3){//3
                System.out.println("Stop Hello");//3
                break;//loop will be stopped by running here
                //anything after here wont be excuted for loop
            }

            System.out.println("Hello Again");//1 2
        }



    }
}
