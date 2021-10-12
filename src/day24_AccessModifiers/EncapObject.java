package day24_AccessModifiers;

public class EncapObject {

    public static void main(String[] args) {
        EncapsulationIntro obj1=new EncapsulationIntro();
        //obj1.name="Mesut";// name is not accessible because it is priavate
        obj1.setName("Mesut");
        //sout
        //obj1.age

        obj1.setAge(25);
        obj1.setIdNum(1231231234);

        System.out.println(obj1.getAge());
        System.out.println(obj1.getIdNum());
        System.out.println(obj1.getName());
       // System.out.println(obj1.name);
    }
}
