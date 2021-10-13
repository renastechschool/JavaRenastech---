package day25_Inheritance.EmployeeExample;

public class Developer extends Employee{
    //Dev : developing ; fixingbugs
    //common functions : name ; jobid , jobtitle ,salary ,age

    //name inherited
    //jobid inherited
    //jobtitle inherited
    //salary inherited
    //age inherited
    //toString inherited

    public Developer(String name , String jobTitle , int age , double salary , long jobID){
        this.name=name;
        this.age=age;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public void developing(){
        System.out.println(name+" is developing ");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }


}
