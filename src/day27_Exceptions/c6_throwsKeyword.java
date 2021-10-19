package day27_Exceptions;

public class c6_throwsKeyword {

    public static void main(String[] args) throws InterruptedException {
        //there is 2 way to handle exceptions so they dont stop compiler from running
        //first you can use try/catch blocks to handle
        //second you can use throws keyword to handle

        //throws keyword will be assigned to your method signature
        System.out.println("Start");
        Thread.sleep(2000);
        System.out.println("Waited 2 second");

        Thread.sleep(3000);
        System.out.println("3 extra second");
    }
}
