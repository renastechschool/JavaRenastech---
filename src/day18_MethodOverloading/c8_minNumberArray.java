package day18_MethodOverloading;

public class c8_minNumberArray {

    //// write a return method that can return minumum number from an int array
    //    //expected output will be number
    public static void main(String[] args) {
        int [] arr1={10,2,5,-100,200,95,0,-25};
        System.out.println("minNumber(arr1) = " + minNumber(arr1));

        double [] arr2={2.5,10.0,0.1,111.55};
       //minNumber(arr2);
        System.out.println("minNumber(arr2) = " + minNumber(arr2));
    }

    public static int minNumber(int[] numbers){
        //first i will assume my minumum number is index 0
        int minumum=numbers[0];

        for (int eachNumber : numbers){

            if (eachNumber<minumum){
                minumum= eachNumber;
            }

        }

        return minumum;
    }


    public static double minNumber(double[] numbers){
        //first i will assume my minumum number is index 0
        double minumum=numbers[0];

        for (double eachNumber : numbers){

            if (eachNumber<minumum){
                minumum= eachNumber;
            }

        }

        return minumum;
    }
}
