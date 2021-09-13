package day03_variablesContinue;

public class c3_StringPractice {
//  create 3 name and assign any name
//  create 3 age assign any number you want to   20 30 40
//  print those age with person name   mesut age is 20
//  also sum those three person age  20 + 30 + 40
// print  "Sum of persons Age = 90 ;

    public static void main(String [] args){

        String name1="Basoz";
        String name2 ="Bahast";

        int age1=25;
        int age2=24;

        System.out.println("Basoz age is 22");

        //  print those age with person name   mesut age is 20
        System.out.println(name1 + " age is : " + age1);
        System.out.println(name2 + " age is : "+ age2);

        System.out.println("Person 1 name is : " + name1);

        //  also sum those three person age  20 + 30 + 40
        // print  "Sum of persons Age = 90 ;
        System.out.println("Sum of persons age is : " + age1 + age2);//text + number + number =text
        System.out.println("Sum of persons age is : " + (age1+age2) ) ;// text + (number + number)==text

        int sumOfAges=age1+age2;

        System.out.println("Sum of All : " + sumOfAges);





    }



}
