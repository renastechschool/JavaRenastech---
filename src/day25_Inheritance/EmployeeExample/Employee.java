package day25_Inheritance.EmployeeExample;

public class Employee {


    //employe types : SDET , DEV , SM , PO
    //SDET functiouns :testing ,foundBug
    //Dev : developing ; fixingbugs
    //SM ; create sucrum meetings

    //all employe types
    //common functions : name ; jobid , jobtitle ,salary ,age


    //parent class : Employee
    //sub classes : SDET , DEV , SM , PO , BA

    //all employe types
    //common functions : name ; jobid , jobtitle ,salary ,age
    public String name;
    public int age;
    public long jobID;
    public String jobTitle;
    public double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobID=" + jobID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
