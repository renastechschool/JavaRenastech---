package day03_variablesContinue;

public class c6_assigment {
    //create 3 different number
    // second number should be = first number + 7
    // third number should be  = second number + 8
    //ex : x=25  , y= 32 , z= 40 .
    //ex : x 20 , y= 27 , z= 35 .

    public static void main(String [] args){
        int x = 33;
        int y = x + 7;
        //y 20+7 = 27
        int z = y + 8;
        //z 27 + 8 = 35

        // print x ,y z
        System.out.println("X is : " + x );
        System.out.println("Y is : " + y );
        System.out.println("Z is : " + z );

        //sum of 3 numbers
        System.out.println("X+y+z = " + (x+y+z));

        //if the x is divisble by 2 ,3 ,5
//        3. check if x is divisible by 2 , 3 , 5  (Check for each number)
//                      if it is divisible print : x  is divisible by 2 true
//                      if it is not divisible print : x is divisible by 2 false

        //System.out.println("20 is divisbile by 2 True"); we need do define number and true condtion

        boolean divisbleBy2forX= x % 2 == 0 ;//if reminder is equal 0 that means number will be divided by 2 without reminder
        //whihc makes the number divisible by 2
        boolean divisibleBy3forx= x% 3 == 0 ;

        System.out.println(x + " is divisible by 2 " + divisbleBy2forX );
        System.out.println(x + " is divisble by 3 " + divisibleBy3forx );

    }

}
