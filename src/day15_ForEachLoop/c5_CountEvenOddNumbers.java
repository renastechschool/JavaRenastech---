package day15_ForEachLoop;

public class c5_CountEvenOddNumbers {

    public static void main(String[] args) {
        //creata a java program that will print count off odd numbers and even numbers from int array
        int []numberList={33,0,2,4,6,7,5,3,100,25,30,200};

        //output will say 6 even numbers
        //4 odd numbers

        int evenCount=0;
        int oddCount=0;

        for (int number : numberList){
            if (number %2 ==0) {
                evenCount++;
            }else {//odd numbers
                oddCount++;
            }
        }

        System.out.println("Even count is " + evenCount);
        System.out.println("odd count is " + oddCount);

        //for loop
        //starting point ending and iteration
        for (int i =0; i < numberList.length ; i++){
            if (numberList[i] %2 ==0) {
                evenCount++;
            }else {//odd numbers
                oddCount++;
            }

        }


        System.out.println("Even count is " + evenCount);
        System.out.println("odd count is " + oddCount);


    }
}
