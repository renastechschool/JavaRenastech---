package day25_Inheritance.EmployeeExample;

public class EmployeeObjects {

    public static void main(String[] args) {

        SDET sdet1=new SDET("firas" , "SDET" , 23 , 120 ,314234234234l);
        Developer developer1=new Developer("Ozge","Developer" , 25 , 130 , 2342343244l);
        System.out.println(developer1);
        developer1.developing();
        System.out.println(sdet1);
        sdet1.testing();
        sdet1.foundBug();
        developer1.fixingBug();

        SM sm1=new SM("recep" , " SM " , 234234423423l);
        //sm1.name=
        System.out.println(sm1);
        sm1.creatingMeetings();
    }
}
