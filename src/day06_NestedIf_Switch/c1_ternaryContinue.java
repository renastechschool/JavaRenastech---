package day06_NestedIf_Switch;

public class c1_ternaryContinue {

    // if else if else if else with ternary

    //this task :
    //create a java program that takes score of student and prints the grade of student
    //between 100 to 85 is grade A
    //between 70 to 84 is grade B
    //between 60 to 69 is grade C
    //between 40 to 59 is grade D
    //between 0 to 39 is grade F
    //if number is not between 0-100 grade 0 ,,"invalid number"

    public static void main(String[] args) {
        int score=55;
        char grade='0';

        String result="";

        if (score>=85 && score <=100){//between 100 to 85 is grade A
            grade='A';
        }else if (score >= 70 && score <85){    //between 70 to 84 is grade B
            grade='B';
        }else if (score >= 60 && score<70){    //between 60 to 69 is grade C
            grade='C';
        }else if (score >= 40 && score < 60){    //between 40 to 59 is grade D
            grade = 'D';
        }else if (score >= 0 && score < 40){    //between 0 to 39 is grade F
            grade = 'F';
        }else{//minus numbers or numbers that are bigger then 100 will be excuted in this else block
            grade = '0';
        }

        result = "Student grade is " + grade;

        System.out.println(result);

        //ternary
        //if ?
        //else :
        //else if   : () ?

        char grade2= (score>=85 && score <=100) ? 'A' : (score >= 70 && score <85) ? 'B'
                : (score >= 60 && score<70) ? 'C' : (score >= 40 && score < 60) ? 'D'
                : (score >= 0 && score < 40) ? 'F' : '0' ;

        System.out.println("Student grade is " + grade2);


        //create a java program to  multiple 2 number and check  if result is divisible by 3 and 5 same time
        //number1 10
        //nukmber2 5
        // num1 * num2 ==50
        //50 is divisible by5 is true but by3 is false
        //output will be false

        int number1=3;
        int number2=5;
        int resultNum1Num2=number2 * number1;


        boolean divisibleBy3By5= ( (number1 * number2) % 3 ==0  &&  (number1 * number2) % 5==0 ) ? true : false;
        //boolean divisibleBy3By5= ( resultNum1Num2 % 3 ==0  &&  resultNum1Num2 % 5==0 ) ? true : false;

        System.out.println(resultNum1Num2 + " is divisible by 3 and 5 : " + divisibleBy3By5);

    }

}
