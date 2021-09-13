package day09_StringMethods;

import java.util.Scanner;

public class c2_TwiterLoginVerification {

    public static void main(String[] args) {
        //create a logic that will check login function of facebook,twitter,gmail.
        //correct username = renastech
        //correct password = renastech123

        //use scanner here to pass usernames and passwords
        //do validation of those usernames and password matching with correct credentials

        String expectedUserName="renastech";
        String expectedPassword="renastech123";

        //correct credentials -- it should pass
        //false credentials   -- it should fail
            //false username true password
            //false password true username
            //false username false password


        Scanner input=new Scanner(System.in);//this will create an object from scanner class

        System.out.println("Enter UserName : ");
        String userInputForUsername=input.nextLine();
        System.out.println("Enter Password : ");
        String userInputForPassword=input.nextLine();

        //to be able to login username and password has to match our expected data
        if (userInputForUsername.equals(expectedUserName) && userInputForPassword.equals(expectedPassword)){
            System.out.println("You have succesfully logged in !!");
        }else {
            System.out.println("Login function has failed");
            System.out.println("Invalid credantials please check your credentials ");
            System.out.println("Credentials are : " +userInputForUsername + " , " + userInputForPassword);
        }

    }
}
