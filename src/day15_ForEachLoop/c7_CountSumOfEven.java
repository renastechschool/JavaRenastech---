package day15_ForEachLoop;

public class c7_CountSumOfEven {

    public static void main(String[] args) {
        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of oddnumbers and sum of even numbers

        int [][] number2D={
                {1,2,3,4},
                {5,6,7,20},
                {8,9,10,11}
        };

        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

        for (int [] each1d : number2D){

            for (int eachNumber : each1d){
                if (eachNumber %2 == 0 ){
                    countEven++;
                    sumEven += eachNumber;
                    System.out.println(eachNumber + " is even number");
                }else { //odd numbers
                    countOdd++;
                    sumOdd += eachNumber;
                    System.out.println(eachNumber + " is odd number");

                }

            }
        }

        System.out.println("Count of even numbers : "+ countEven + " sum of even numbers " + sumEven);
        System.out.println("Count of odd numbers : "+ countOdd + " sum of odd numbers " + sumOdd);



    }
}
