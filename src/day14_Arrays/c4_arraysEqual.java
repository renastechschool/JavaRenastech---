package day14_Arrays;

import java.util.Arrays;

public class c4_arraysEqual {
    public static void main(String[] args) {

        //hello
        //helol

        //arrays equal
        int [] arr1={3,5,7};
        int [] arr2={5,3,7};
        int [] arr3={3,5,7};
        int [] arr4={3,4,7};

        boolean b1= Arrays.equals(arr1,arr2);//false
        boolean b2= Arrays.equals(arr1,arr3); // true
        boolean b3= Arrays.equals(arr2,arr3); //false
        boolean b4= Arrays.equals(arr1,arr4); //false

        //false , true , false , false
        //only condition array equal will be true is if both array are equal with value and order

        System.out.println(b1 + " , " + b2 + " , " + b3 + " , " + b4);

        System.out.println("___--------------");
        Arrays.sort(arr1);//{3,5,7};
        Arrays.sort(arr2);//{3,5,7};
        Arrays.sort(arr3);//{3,5,7};
        Arrays.sort(arr4);//{3,4,7};


        boolean b11= Arrays.equals(arr1,arr2);//true
        boolean b22= Arrays.equals(arr1,arr3); // true
        boolean b33= Arrays.equals(arr2,arr3); //true
        boolean b44= Arrays.equals(arr1,arr4); //false

        //false , true , false , false
        //only condition array equal will be true is if both array are equal with value and order

        System.out.println(b11 + " , " + b22 + " , " + b33 + " , " + b44);
    }

}
