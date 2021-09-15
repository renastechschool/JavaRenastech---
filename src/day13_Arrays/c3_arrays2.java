package day13_Arrays;

public class c3_arrays2 {

    public static void main(String[] args) {

        int [] arr={5,-15,25};
                    //0 1  2
        System.out.println(arr.length);

        int [] arr2 =new int[20];
        System.out.println(arr2[2]);

        //store numbers from 3 to 22
//        arr2[0]=3;
//        arr2[1]=4;
//        arr2[2]=5;
        //...

        System.out.println("***********");
        for (int i=0 ; i <= arr2.length-1 ; i++){
            arr2[i] = i +3;
            //arr2[0]= 0+ 3; 3
            //arr2[1]= 1+ 3; 4
            //...
            //arr2[19] = 19 + 3
            System.out.println(arr2[i]);
        }

        System.out.println("***********");

        int [] numbers= { 4 ,8 ,12};
        System.out.println(numbers[1]);

        numbers[1]= 5; //numbers index 1 will be reassigned to 5
        //new array values will be   { 4 ,5 ,12}
        System.out.println(numbers[1]);

        numbers[0] = numbers[2];
        //{ 12 ,5 ,12}

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        //create a condition that will check list of array and it will print even numbers from the list



    }
}
