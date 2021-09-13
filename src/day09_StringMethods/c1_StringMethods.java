package day09_StringMethods;

public class c1_StringMethods {
    //charAt()	          Returns the character at the specified index (position)	        char
    //indexOf()	          Returns the position of the first found occurrence
    //                      of specified characters in a string	                            int
    //isEmpty()	          Checks whether a string is empty or not	                        boolean
    //lastIndexOf()	      Returns the position of the last found occurrence of
    //                      specified characters in a string	                                int

    public static void main(String[] args) {
        //task
        //1.you will create a scanner where you ask user how  is the weather
        //2.you will need to store that in a string to check in the if statmenet
        //3.you will create an if else block where you check weather
        //if weather is good you create another scanner where it ask user to put temprature
        //if wether is bad you dont ask for temprature

        String sentence="Hello world . Java is here llllo ";
                       //01234
        char ch=sentence.charAt(3);
        System.out.println(ch);//second l
        System.out.println(sentence.charAt(2));//first l

        //indexOf()	          Returns the position of the first found occurrence
        //                      of specified characters in a string	                            int
        System.out.println(sentence.indexOf("l"));//it will check first matching l from sentence and
        //return first l index number which is 2
        System.out.println(sentence.indexOf("ll"));// index 2
        System.out.println(sentence.indexOf("lo"));//this is how you can get second l index number
        //to get l index number from second lo
        int indexNumber=sentence.indexOf("lllo "); //+2
        System.out.println(indexNumber);
        System.out.println(indexNumber + 2);

        //get last index of letter e from sentence
        //int lastIndexe=sentence.indexOf("re") + 1;
        //int lastIndexe=sentence.indexOf("e lll");
        int lastIndexe=sentence.indexOf("e ");
        System.out.println("Last e "+lastIndexe);

        //lastIndexOf()	      Returns the position of the last found occurrence of
        //                      specified characters in a string	                                int

        String sentence2="Hello world . Java is here llllo ";

        System.out.println("**************");
        //to get last l index
        System.out.println(sentence2.lastIndexOf("l"));
        //index of first l
        int indexFirstl=sentence2.indexOf("l");
        int indexLastl=sentence2.lastIndexOf("l");
        int indexSecondl=sentence2.indexOf("lo");
        int indexBeforeLastl=sentence2.lastIndexOf("llo");

        System.out.println(indexFirstl + "," + indexLastl);
        System.out.println(indexSecondl + "," + indexBeforeLastl);

    }

    //create a logic that will check login function of facebook,twitter,gmail.
    //correct username = renastech
    //correct password = renastech123

    //use scanner here to pass usernames and passwords
    //do validation of those usernames and password matching with correct credentials
}
