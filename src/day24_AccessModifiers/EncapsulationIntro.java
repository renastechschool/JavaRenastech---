package day24_AccessModifiers;

public class EncapsulationIntro {
 /*
     OOP PRINCIPLES : object oriented programing language
•Encapsulation :(Data Hiding)
•Inheritance   :
•Abstraction   :
•Polymorhism   :

OOP  will combine group of realated variables and functıonus to unit (object).
     */

    /*
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
Therefore, it is also known as data hiding.

To achieve encapsulation in Java −
1.Declare the variables of a class as private.
2.Provide public setter and getter methods to modify and view the variables values from outside of class.

     */

    //1.to hide data
    private String name;
    private long idNum;
    private int age;
    //nobody will have direct accces to above variables

    //since all the varibles are priavate which will make them not accessable from outside
    //you will need to assign or modify them
    //there should a way to do this
    //2.Provide public setter and getter methods to modify and view the variables values.
    //this is encapsulation

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setIdNum(long idNum){
        this.idNum=idNum;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public long getIdNum(){
        return idNum;
    }
}
