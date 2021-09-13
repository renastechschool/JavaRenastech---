package day02_variables;

public class c1_printvsprintln {

    public static void main(String [] args){
        //first line
        System.out.println("This is println"); //println will break the curret line

        //second line
        System.out.print("--this is print");  //print will never break the line
        //it will continue same  line that you are using

        //second line
        System.out.print("-- continu to print ");//print wont break the line

        //second line
        System.out.print("--continue print 2 ");//print wont break the line

        //second line
        System.out.println("println2");//first it will print this in second line
        //since we used println now next line will be third

        //third line
        System.out.print("print 3"); // this wont break the line

        //third line
        System.out.println("println3");

        //fouth line
        System.out.println("println4");

    }

    /*
consule output should be same order as given below
    First Name : name , ID : number
    Company Name :
    Salary :
 */


}
