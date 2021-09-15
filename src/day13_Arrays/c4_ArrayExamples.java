package day13_Arrays;

public class c4_ArrayExamples {

    public static void main(String[] args) {
        //create a condition that will check list of array and it will print even numbers from the list
        int [] numbers={-2,-5,10,20,30,33,44,100};
        //output should be -2 10 20 30 44 100

        //loop
        //starting point as well as ending point
        for (int i =0 ; i < numbers.length ;i++){

            if (numbers[i] %2 == 0){
                System.out.println(numbers[i] + " is even number ");
            }
        }


        //        //create a condition that will print min and max number from given array

        int [] listOfNumbers={10,0,100,200,500,5,-5,20};

        //max == 500
        //min == - 5

        //just assume
        int max = listOfNumbers[0];//10
        int min = listOfNumbers[0];//10

        for (int i =0 ;i < listOfNumbers.length ; i++){ // 0 1 2 3 ... lastindex

            if (listOfNumbers[i]>max){ //[2]=100 > 10   // [3] 200 >100 //[4] 500 >200
                max=listOfNumbers[i];//this will reassign new max values the max variable
            }

            if (listOfNumbers[i] < min){
                min = listOfNumbers[i];
            }
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);




    }
}
