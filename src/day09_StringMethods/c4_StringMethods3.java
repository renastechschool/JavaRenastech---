package day09_StringMethods;

public class c4_StringMethods3 {
    //replace()	          Searches a string for a specified value, and returns
    //                      a new string where the specified values are replaced	            String
    //replaceFirst()	      Replaces the first occurrence of a substring that matches the
    //                      given regular expression with the given replacement	            String
    //
    //startsWith()	      Checks whether a string starts with specified characters	        boolean
    //substring()	          Extracts the characters from a string,
    //                      beginning at a specified start position,
    //                      and through the specified number of character	                    String
    //toLowerCase()	      Converts a string to lower case letters	                        String
    //toUpperCase()	      Converts a string to upper case letters	                        String
    //trim()	              Removes whitespace from both ends of a string	                    String

    public static void main(String[] args) {
        String word="Hello world 123 hello world 123";
        //replace()	          Searches a string for a specified value, and returns
        //                      a new string where the specified values are replaced	            String

        //remove all e from word and pass x as a replecment
        System.out.println(word.replace("e","x"));
        System.out.println(word);

        //remove all world from sentence and replace with planet
        System.out.println(word.replace("world","planet"));
        System.out.println(word);//since we didnt reassigned this wont change

        word=word.replace("o","");
        System.out.println(word);


        //replaceFirst()	      Replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement	            String

        String str="Java is here , planet is Java , Java is planet";

        //replacefirst will only replace first matching one
        String newStr=str.replaceFirst("Java","Python");
        System.out.println(newStr);

        //replace will replace all the matching ones
        System.out.println(str.replace("Java","Python"));

        System.out.println(str.replace("Java ,","Python ,"));


        //startsWith()	      Checks whether a string starts with specified characters	        boolean
        // endsWith()	    Checks whether a string ends with the specified character(s)	    boolean
        // if your string ends with given condition it will be true
        // if it is not then you will have false
        System.out.println("****************");
        String sentence="Java Hello Java 123 World Java";

        //check if sentence either startswith or endswith Java
        boolean b1=sentence.startsWith("Java") || sentence.endsWith("Java");
        //check if sentese startswith and endswith java
        boolean b2=sentence.startsWith("Java") && sentence.endsWith("Java");

        if (b1){
            System.out.println("Sentence either starting or ending with Java");
            if (b2){
                System.out.println("Sentence starts and ends with Java");
            }else {
                System.out.println("since b1 is true one of condition is java");
            }
        }else {
            System.out.println("Sentence doesnt start or end with java");
        }

        //substring()	          Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character	                    String

        //we have 2 method
        //first substring(beginiing index , ending index) :
        //this will print starting given index until the ending index (excluded ending index)
        //second substring(beginiing index) : this will start printing from given index to end of the sentence

        String letters="Hello world java";
                     ///01234567891011 12=j
        //print world java
        System.out.println(letters.substring(6));//
        //print world
        System.out.println(letters.substring(6,10));//last index wont be included worl
        System.out.println(letters.substring(6,10+1));//world
        //print Hello
        System.out.println(letters.substring(0,4+1));

        //lets say you have a long sentence and if you dont want to count
        int indexOfJava=letters.indexOf("j");
        //System.out.println(indexOfJava);//12
        System.out.println(letters.substring(indexOfJava));

    }
}
