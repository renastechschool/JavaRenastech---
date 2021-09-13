package day11_whileLoop;

public class c4_WhileLoopPractice {
    public static void main(String[] args) {

        //print below figure
        // *********************  20 star
        System.out.println("*****");

        int i=1;

        while (i <= 20 ){
            System.out.print("*");
            i++;
        }

        //print below figure
        /*

         ****
         *  *
         *  *
         *  *
         *  *
         *  *
         *  *
         ****

         */

        System.out.println();

        int nmbr=1; //6 times
        System.out.println("****");
       // System.out.println("*  *");//6 times

        while (nmbr < 7) { // 1 to 6
            System.out.println("*  *");// 6 times
            nmbr ++;
        }
        System.out.println("****");

    }
}
