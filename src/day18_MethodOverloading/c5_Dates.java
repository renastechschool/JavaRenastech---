package day18_MethodOverloading;

import java.time.LocalDate;

public class c5_Dates {

    public static void main(String[] args) {

        //localdate class is coming from java librarry as well
        LocalDate localDate1=LocalDate.of(2021,10,1);
        //objects creating from classes

        System.out.println(localDate1);

        LocalDate localDate2=LocalDate.of(2020,6,5);
        System.out.println(localDate2);

        boolean b1=localDate1.isAfter(localDate2);//true
        boolean b2=localDate1.isBefore(localDate2);//false
        boolean b3=localDate1.isEqual(localDate2);//false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println("b3 = " + b3);

        //to print today date
        LocalDate todayDate=LocalDate.now();
        System.out.println(todayDate);


        //replace - with dot on today date result
       String todayDateString=todayDate.toString();
       todayDateString = todayDateString.replace("-",".");

        System.out.println("todayDateString = " + todayDateString);
    }
}
