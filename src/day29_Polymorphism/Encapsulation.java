package day29_Polymorphism;

public class Encapsulation {

    private String password;
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

class EncapTest{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
//        obj.password;
        obj.setPassword("hello123");
        obj.setUserName("Mesut");

        System.out.println("obj.getUserName() = " + obj.getUserName());
        System.out.println("obj.getPassword() = " + obj.getPassword());
    }
}
