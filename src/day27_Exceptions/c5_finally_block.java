package day27_Exceptions;

import java.util.NoSuchElementException;

public class c5_finally_block {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);//arithemetic exception // uncheked

        }catch (NoSuchElementException exc){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array excep");
        }catch (ArithmeticException e){
            System.out.println("arithmetic exccep");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("Finally block ");
        }

        //how finally blocks works
        //finally block will get executed no matter where try catch will catch execption.
    }
}
