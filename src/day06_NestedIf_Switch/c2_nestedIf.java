package day06_NestedIf_Switch;

public class c2_nestedIf {

    //simply nested if is if conditions inside of if conditions
    //if the main if condition is true then you will check sub if conditions

    public static void main(String[] args) {

//        if (){
//            if (){
//
//            }else if (){
//
//            }else if (){
//
//            }else{
//
//            }
//
//        }else if (){
//            if (){
//
//            }else{
//
//            }
//
//        }else{
//
//            if (){
//
//            }else {
//
//            }
//
//        }

        ////this task :
        //    //create a java program that takes score of student and prints the grade of student
        //    //between 100 to 51 is grade A
        //    //between 0 to 50 is grade B
        //    //if number is not between 0-100 grade 0 ,,"invalid number"
        //    if students absent
        //    if number is valid numnber

        int score = 25;
        String attend= "Yes"; // Yes , No

        String result="";

        if (attend == "Yes" || attend == "yes"){ //java is case sensitive language make sure to pass exact match
            if (score >= 51 && score <=100){
                //this will apply where student was present and
                // have score between 51 toc 100
                result = "Student was present and Student Score is " + score + " Grade is A";
            }else if (score >=0 && score < 51){
                result = "Student was present and Student Score is " + score + " Grade is B";
            }else {
                result = "Student was present and Student Score is " + score + " Invalid number Check Score !!!!";
            }
        }else if (attend=="No"){
            result = "---------Student was Absent--------";

        }else { //this will cover invalid characters for atttendence
            result = " !!!!!! Invalid Text for Attendence Please check Attendece !!! "+ attend;
        }

        System.out.println(result);


    }
}
