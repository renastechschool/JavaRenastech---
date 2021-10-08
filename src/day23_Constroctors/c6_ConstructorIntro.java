package day23_Constroctors;

public class c6_ConstructorIntro {
    //constructor is a special method which has to have class name as a method name
    //if you dont create an contructor java will create one for you


    //constructor needs to have same name that class  has

//    public c6_ConstructorIntro(){
//        //this will be created automatically if you dont create
//        //constructor helps class to create an object
//        System.out.println("default constrctor");
//    }

    //can we overloadd constroctor methods
    //yes

    public c6_ConstructorIntro(){
        System.out.println("Constructor created");
    }

    public c6_ConstructorIntro(int a){
        System.out.println("Constractor with int " + a);
    }

    public static void main(String[] args) {
        c6_ConstructorIntro obj2=new c6_ConstructorIntro();
        c6_ConstructorIntro obj1=new c6_ConstructorIntro(10);
    }
}
