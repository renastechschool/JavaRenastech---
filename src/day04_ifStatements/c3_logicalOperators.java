package day04_ifStatements;

public class c3_logicalOperators {

    // && -- and
    // || -- or
    //  !  -- not (opposite)

    public static void main(String[] args){

        // && -- and
        System.out.println( (5>3) && (3>5) );//(true && false) //false
        System.out.println( (10<5) && (0==0));//false && true  //false
        System.out.println((1==2) && (2!=2));//false && false   //false
        System.out.println((10>=10) && (10<=10)); //true && true  // true

        //if you are using and operator only option that you will get your result is all conditions true
        //other then that alwasy will be false
        //true && true && true && false && true ==false

        System.out.println("***************************");

        // || -- or
        System.out.println( (5>3) || (3>5) );//(true || false) //true
        System.out.println( (10<5) || (0==0));//false || true  //true
        System.out.println((1==2) || (2!=2));//false || false   //false
        System.out.println((10>=10) || (10<=10)); //true || true  // true

        //  shift plus \ == |
        //  shift number 7 == &

        //true ||  true ||  true ||  false || true ==true
        //false || true || false == true

        System.out.println("************");

        //  !  -- not (opposite)
        // !true == false
        // !!false ==> !true == > false

        boolean bool1=true;
        boolean bool2= ! (10 !=15) ; // !(true) == false
        System.out.println(bool1 && bool2); //true && false

        boolean bool3= !!!!!!bool1; //!!!!!!true
        //!!!!!false
        //!!!!true
        //true

        boolean bool4= !(15>=15);//!(true ) == false

        System.out.println( (bool3||bool4) && true );
        //(true || false ) == true
        //true && true == true

        System.out.println(("Bahast" == "bahast") || ("ridvan" != "Ridvan")); // false || true
        //java is case senstivy language //to be able to ompare 2 string they have to have exact match

        System.out.println( ("Pelin"=="Pelin ") || ("Ozgur12&"=="Ozgur21&"));// false || false
        //what ever you have in the string will be a character either number letter or space or special character

    }
}
