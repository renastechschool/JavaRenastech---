package day08_String;

public class c3_StringMethods {

        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
        public static void main(String[] args) {
            //charAt()	          Returns the character at the specified index (position)	        char
            //charAt method will ask you to pass index number (position number)

            String str = "Hello";
                        //01234
            //index numbers always starts from 0 in the java

            char letter0=str.charAt(0); //H
            System.out.println(letter0);
            System.out.println(str.charAt(3)); //l

            //char ch=str.charAt(5);
            //System.out.println(ch);//StringIndexOutOfBoundsException String index out of range: 5
            //beacuae our range is between 0-4

            String word="hello world";
                       //012345678910
            System.out.println("wordchar5 is : " + word.charAt(5));


            //concat()	          Appends a string to the end of another string	                    String
            //
            String firstName="Basoz";
            String lastName="Rafiq";

            System.out.println(firstName + " " + lastName);
            System.out.println(firstName.concat(" " + lastName));
            System.out.println(firstName.concat(" ").concat(lastName));

            String fullName = firstName.concat( " ").concat(lastName);
            System.out.println(fullName);

            System.out.println("*************");
            System.out.println(fullName.concat(" " + str));

            //System.out.println(fullName.concat(letter0)); // Basoz RafiqH
            //concat method will only accept string
            //i cant concat other then string
            System.out.println(fullName.concat(""+letter0));//Basoz RafiqH  //text + letter == text

            int score=90;
            System.out.println(fullName.concat(" ").concat(""+ score));

            //basoz rafiq score is 90
            System.out.println(
                    firstName.concat(" ").concat(lastName).concat(" ").concat("score is : ").concat(""+score));

            //contains()	   Checks whether a string contains a sequence of characters	        boolean

            //contains will check if the string contains given value
            //if string contains it will return true
            //if string doesnt contains it will return false

            String sentence="Java dsd kjllk2342@#  ";
            System.out.println(sentence.contains("a"));
            System.out.println(sentence.contains("A"));
            System.out.println(sentence.contains("Ja"));
            System.out.println(sentence.contains("Ja "));//false there is no Ja(space) inside the sentence
            System.out.println(sentence.contains("va "));//

            boolean example=sentence.contains(" ");
            System.out.println(example);

            System.out.println("********************");

            //endsWith()	    Checks whether a string ends with the specified character(s)	    boolean
            // if your string ends with given condition it will be true
            // if it is not then you will have false

            String sentence2="Hello World Java 47";
            System.out.println(sentence2.endsWith("7"));
            System.out.println(sentence2.endsWith("47"));
            System.out.println(sentence2.endsWith(" 47"));
            System.out.println(sentence2.endsWith("Java 47"));
            System.out.println(sentence2.endsWith("Hello World Java 47"));
            System.out.println(sentence2.endsWith("JavA 47"));

        }
}
