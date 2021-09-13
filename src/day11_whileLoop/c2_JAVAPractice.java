package day11_whileLoop;

public class c2_JAVAPractice {

    public static void main(String[] args) {
        //write a java program that will check numbers from 1-50
                //if number is divisible by 2 print JA
                //If number is divisible by 3 print VA
                //If number is divisible both by 2 and 3 JAVA
                //if it is not divible by 2 or 3 print number itself

//excpected result : // 1  2    3    4    5   6 ...50
                     // 1  JA   VA   JA   5  JAVA

        String result="";//just empty string to store all result

        //starting point is 1
        //ending point is 50
        //iteration ++
        for (int i =1; i < 51 ; i++){ //6

            if (i%2 ==0 && i%3==0){
                result +="JAVA ";
            }else if (i %3==0){
                result +="VA ";
            }else if (i %2 ==0){
                result +="JA ";
            }else{
                result += i + " ";
            }
        }

        System.out.println(result);
    }
}
