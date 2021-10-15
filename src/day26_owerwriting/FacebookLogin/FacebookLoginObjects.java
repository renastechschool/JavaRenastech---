package day26_owerwriting.FacebookLogin;

public class FacebookLoginObjects {

    public static void main(String[] args) {
        FacebookLogin obj1=new FacebookLogin();

        //obj1.username = " java ";
        obj1.setUsername("hello world");
        obj1.setPassword("java is here");

        System.out.println("obj1.getUsername() = " + obj1.getUsername());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

    }
}
