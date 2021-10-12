package day24_AccessModifiers;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1=new Person("SUPHI");
        System.out.println("person1.name = " + person1.name);

        //person1.age=25 ;
        person1.setAge(25);
        System.out.println("Suphi age is " + person1.getAge());

        Person person2=new Person("Meral");

        person2.setID(32423423442234l);
        System.out.println("Meral id is " + person2.getID());
    }
}
