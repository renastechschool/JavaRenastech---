package day09_StringMethods;

public class c5_StringMethods4 {

    public static void main(String[] args) {
        ////toLowerCase()	      Converts a string to lower case letters	                        String
        //    //toUpperCase()	      Converts a string to upper case letters	                        String
        //    //trim()	              Removes whitespace from both ends of a string	                    String

        String fullName="Berkan Karabulut";
        System.out.println(fullName.toLowerCase());//berkan karabulut
        System.out.println(fullName.toUpperCase());//BERKAN KARABULUT

        String fullName2="ibrAhiM karaaGAC";
                        //012345678
        //print me initials are capital : Ibrahim Karaaagc
        String firstName=fullName2.substring(0,1).toUpperCase().concat(fullName2.substring(1,6+1).toLowerCase());//I + others.lowercase

        System.out.println(firstName);
        String lastName=fullName2.substring(8,9).toUpperCase().concat(fullName2.substring(9).toLowerCase());
        System.out.println(lastName);

        String newFullName2=firstName.concat(" ").concat(lastName);
        System.out.println(newFullName2);


        //    //trim()	              Removes whitespace from both ends of a string	                    String

        String str="     hello     java     planet     ";
        System.out.println(str.trim());//remove extra spaces from beginning and ending
        //not from middle

        //if you want to remove all spaces from sentece
        System.out.println(str.replace(" ",""));

    }
}
