package day23_Constroctors;

public class Student {

    //id //grade//name

    String name; //inst
    int id;
    static String schoolName;//static

    static int countNumbers=0;

    public void setStudentInfo(String name ){
        this.name=name;
        id = setStudentNumber();
    }

    //create a function that will set stundet number for any new students
    public static int setStudentNumber(){
        countNumbers++;
        return countNumbers;
    }

    public static void setSchoolName(String school){
        schoolName=school;

    }

    public void getInfo(){
        //you can create your method static or instqance
        //but if you make static method and if you are going to use instance varible
        //we will need to create object
        //thats why we prefer this method as a instance so i can use static (gloabal) or instance variable
        System.out.println("Name :" + name);
        System.out.println("Number : "+id);
        System.out.println("School : "+schoolName);
    }



}
