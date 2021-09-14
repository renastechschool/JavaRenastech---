package day13_Arrays;

public class c1_arraysIntro {

    public static void main(String[] args) {
        //int ,double float
        //each variable has own value
        //if we want to store multiple values in one list

        int number1=1;
        int number2=2;
        int number3=3;
        //...
        //arrays : containers for multiple variables
        // as a conttainer that will store multiple values inside
        //and it has ready methods where you can modify your variables

        //declaration of array
        //DataType [] nameofyourcontainer = {data1,data2,data3, .... }

        //container for numbers
        //integaer container
        int [] numbers= {100,2,5,955,10,25,3,7,9}; //this  is int array
        //you cannot store any other data type inside here
        //array has index numbers
                     /// 0   1  2  3  4  5 6 7 8

        //printing third number (index 2 )
        System.out.println(numbers[2]);

        int firstNumber=numbers[0];
        System.out.println(firstNumber);

        System.out.println(numbers[9]);//ArrayIndexOutOfBoundsException error

    }
}
