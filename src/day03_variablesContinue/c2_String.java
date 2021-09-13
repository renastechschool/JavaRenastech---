package day03_variablesContinue;

public class c2_String {

    // string is non primitive data type

    public static void main(String [] args){

        String nameOfStudent="Ozer";
        String schoolName="Reneastech";

        int studentID=23456;//number
        String  id ="12423";//this will be a text
        System.out.println(nameOfStudent);
        System.out.println("Name is : " + nameOfStudent + " ,Student ID : " + studentID);

        //if you want to print different lines
        System.out.println("name is : " + nameOfStudent + "\nSchool Name : "+schoolName);


        String number1="1000";
        int number2=1000;

        System.out.println(number1+10);//text + number  (since we have string inside it will concat )100010
        System.out.println(number2+10);//number + number (since both is number it will sum)1010


    }

}
