package day25_Inheritance.EmployeeExample;

public class SM extends Employee {
    //SM ; create sucrum meetings

    // //common variables : name ; jobid , jobtitle ,salary ,age

    //name inherited
    //jobid inherited
    //jobtitle inherited
    //salary inherited
    //age inherited
    //toString inherited


    public SM(String name, String title , long id) {
        this.name=name;
        this.jobID=id;
        this.jobTitle=title;
    }

    public void creatingMeetings(){
        System.out.println(name + " is scheduled sprint meetings");
    }
}
