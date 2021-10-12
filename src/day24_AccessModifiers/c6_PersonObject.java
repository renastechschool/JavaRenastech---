package day24_AccessModifiers;

public class c6_PersonObject {

    public static void main(String[] args) {
        c5_MalePerson male1=new c5_MalePerson();
        //to be able to access static we will need use class name not objecy
        System.out.println("c5_MalePerson.isHuman = " + c5_MalePerson.isHuman);
        System.out.println("c5_MalePerson.gender = " + c5_MalePerson.gender);

        male1.name="Firaz";
        male1.age=23;

       // c5_MalePerson.ID  no access allowed id is priavate

        if (c5_MalePerson.isHuman && c5_MalePerson.gender=='M'){
            System.out.println("Person name  "+ male1.name);
            System.out.println("Age "+ male1.age);
        }


    }
}
