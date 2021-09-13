package day11_whileLoop;

public class c3_WhileLoop {

    public static void main(String[] args) {

        //structure of for loop

        for (int i = 0 ; i <100 ; i++){
            //starting point int i = 0   // initilization
            //ending point i <100        // condition
            //iteration  i++             // iteration
        }

        //while loop : while loopp will be keep runninng as long as while condition is true
        //initilization will be outside of while loop
//        while (100 > 95){//condition here
//            System.out.println("Hello world");
//            //iteration
//        }
        //since condition is always true loop will be infinitive

        int i = 0; // initilization

        while (i<11){// condition//0 1
            System.out.println("Hello World" + i);//0 1
            i++;// iteration
        }

        ///java read lines from top the bottom
        int number1=5;
        while (number1 > 0){ //5 4 3 2 1
            number1--;//4 3 2 1 0
            System.out.println(number1);//4 3 2 1 0
        }

        System.out.println("****************");
        int number2=5;
        while (number2 > 0){ //5 4 3 2 1
            System.out.println(number2);//5 4 3 2 1
            number2--;//4 3 2 1 0
        }
    }
}
