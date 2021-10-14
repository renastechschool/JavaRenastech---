package day26_owerwriting;

class test3 {
    int number = 25;

    public test3(int i ){
        System.out.println("i " + i  );
        System.out.println("this.number = " + this.number);
    }
}
public class c3_ConstructorSuper extends test3{

    //below methods will be inherited
    //test3
    //number comes from parent

    int number=50; // number here for child

    public c3_ConstructorSuper(){
        super(100);
        System.out.println("deafault c3");
        System.out.println("this.number = " + this.number);
        System.out.println("super.number = " + super.number);

        ///this keyword is used for calling in same class
        //super keyword help us to call from parent
    }

    public static void main(String[] args) {
        c3_ConstructorSuper obj=new c3_ConstructorSuper();
    }
}
