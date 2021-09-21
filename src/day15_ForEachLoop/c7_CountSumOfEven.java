package day15_ForEachLoop;

public class c7_CountSumOfEven {

    public static void main(String[] args) {
        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of odd numbers and sum of even numbers

        int [][] number2D={
                {1,2,3,4},
                {5,6,7,20},
                {8,9,10,11,15}
        };

        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

        for (int [] each1d : number2D){ // 0 1 2 each1d

            for (int eachNumber : each1d){//0123  0123  01234
                if (eachNumber %2 == 0 ){
                    countEven++;//1234.. this will give you total count of even numbers
                    sumEven += eachNumber; //2+ 4 +6
                    System.out.println(eachNumber + " is even number");
                    //System.out.println(sumEven);
                    //System.out.println(countEven);
                }else { //odd numbers
                    countOdd++;//12345... this will give you total count of odd numbers
                    sumOdd += eachNumber;  // 1 +  3 +5  ...
                    System.out.println(eachNumber + " is odd number");
                    //System.out.println(sumOdd);
                    //System.out.println(countOdd);

                }

            }
        }

        System.out.println("Count of even numbers : "+ countEven + " sum of even numbers " + sumEven);
        System.out.println("Count of odd numbers : "+ countOdd + " sum of odd numbers " + sumOdd);

    }
}
