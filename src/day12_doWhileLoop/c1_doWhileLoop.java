package day12_doWhileLoop;

public class c1_doWhileLoop {

    public static void main(String[] args) {
        //for loop
        //while loop
            //it will run as long as your condition is true
            //it will stop running when your condition turns to false
        //do while loop
            //it will run once at the begininng no mather your while condition is true or false
            //it will continue to run if while is true

        int number=10;

        while (number<10){//since condtion is false it wont print anything from inside while
            System.out.println("While loop");
        }

        do {//do will run at least one time no mather condition is true or false
            System.out.println("do while loop ");
        }while (number <10 );

        //infinitive do while
//        do {
//            System.out.println("hello");
//        }while (number==10);

        int number2=2;

        do {
            System.out.println("Number 2 is "+number2);//2 3 4 5 6 7 8 9
            number2++;//3 ... 9 10
        }while (number2 < 10);//3 ...9 10

        int number3=3;
        do {
            System.out.println(number3); //3
            number3--;//2
        }while (number3<0);//false condition

        ///printing even numbers from 0 - 100

        int number4=0; //starting point

        do {
            if (number4%2==0){
                System.out.print(number4 + " , ");
            }
            number4++; // iteration

        }while (number4<=100);//condition end point

    }

}
