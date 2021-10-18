package day27_Exceptions;

public class c2_ExeptionTypes {
    //Exceptions: unexpected or unwanted events
//
//	there two types of exception:
//			1.unchecked (unexpected event):If a program throws an unchecked exception,
//			it reflects some error inside the program logic
//			occures during run time
//				RuntimeException class is the parent of all exceptions
//
//			2.checked (unwanted events): In general, checked exceptions represent errors outside the
//			control of the program.
//			occurs during the compile time. needs to be handled immediatlly

    public static void main(String[] args)  {
        System.out.println("Java Exceptions Topic");

        ////			1.unchecked (unexpected event):If a program throws an unchecked exception,

        //System.out.println(20/0); //uncheked exeptions
        //occures during run time
				//RuntimeException class is the parent of all exceptions
        //for uncheked exeptions you wont see any java warning messages
        //you will see warning in the consule after you run

        String name="Bahast";

        //System.out.println(name.charAt(100));//StringIndexOutOfBoundsException
        //we got the warniing after we run
        //this is a runtime exception
        //uncheked exeption.


        int [ ] arr = {10,20,30};
        //System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
        //runtime and uncheked

        //2.checked (unwanted events): we will need to handle before we run
        // those will give us warning mesage before the run

        //
        System.out.println("hello");
        //Thread.sleep(5000); //InterruptedException;// 3 sn
        //this is cheked exceptions because it gives us warning message before we run the code
        System.out.println("hello ");

    }
}
