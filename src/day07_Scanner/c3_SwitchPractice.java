package day07_Scanner;

public class c3_SwitchPractice {

    //Duplicate case values are not allowed.
    //The value for a case must be of the same data type as the variable in the switch. (or smaller then switch range)
    //The value for a case must be a constant or a literal. Variables are not allowed.
    //The break statement is used inside the switch to terminate a statement sequence.
    //The break statement is optional. If omitted, execution will continue on into the next case.
    //The default statement is optional and can appear anywhere inside the switch block.
    //          In case, if it is not at the end, then a break statement must be kept after the
    //          default statement to avoid the execution of the next case statement.

    //Accepted Data Types
    //The variable passed as a switch argument can be one of the following:
    //char
    //byte
    //short
    //int
    //String
    //Integer,Short,Byte,Character

    public static void main(String[] args) {
        //create an logic that will check the number and print the day name
        byte b1=1;
        short s1=2;
        int number =70;
       // long l1=5; not acceptable
        //float f1= 7;  not acceptable
        //double d1=10;  not acceptable

        String dayName; //empty string not assigned anything yet
        String dayType;

        //The value for a case must be of the same data type as the variable in the switch.
        // (or smaller then switch range)

        //The value for a case must be a constant or a literal. Variables are not allowed.


        //if you dont specify whole number type java will take as a int number
        switch (number){

            case 1:
                dayName = "Monday";
                break;
            //case 1:     //Duplicate case values are not allowed.
            case  2 :
                dayName="Tuesday";
                break;
            case 3 :
                dayName ="Wed";
                break;
            case 4:
                dayName = "Thurs";
                break;
            case 5:
                dayName=" Friday";
                break;
            default:
                //The default statement is optional and can appear anywhere inside the switch block.
                //          In case, if it is not at the end, then a break statement must be kept after the
                //          default statement to avoid the execution of the next case statement.
                dayName = "Invalid Day";
                break;
            case 6 :
                dayName = "Sat";
                break;
            case 7 :
                dayName ="Sunday";

        }

        System.out.println(dayName);

        //print case number 1-5 as weekday
        //6 and 7 is weekend

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
               break;
            default:
                dayType="Invalid DAyType";
        }

        System.out.println(number + " is a "+dayName);
        System.out.println(number + " is a "+dayType);
        System.out.println(dayName + " is a "+dayType );

    }

}
