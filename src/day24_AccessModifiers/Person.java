package day24_AccessModifiers;

public class Person {

    //name , id  ,age
    //

    public String name;
    private long ID ;  //encapsulatin 1 part
    private int age; //encapsulatin 1 part


    public Person(String name){
        this.name=name;
    }

    //encapsulation
    //1.to hide data from outside by making variables priavate
    //2.Provide public setter and getter methods to modify and view the variables values.

    public void setIDAndAge(int age, long ID){
        //setid
        //setage

        this.ID=ID;
        this.age=age;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }



    private void test1(){
        System.out.println("Priavate test");
    }

    public void test2(){
        System.out.println("test2");
        test1();
    }
}
