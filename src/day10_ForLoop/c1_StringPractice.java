package day10_ForLoop;

public class c1_StringPractice {

    public static void main(String[] args) {
        //How do you split a sentence based in specific character?
        String sentence="Hello java is planet ,java is beautful java is best ";

        //to split from second java
        int indexOfPlanet=sentence.indexOf("java is b");
        String splitedSentence=sentence.substring(indexOfPlanet);
        System.out.println(splitedSentence);


        System.out.println(sentence.length());
        //length is equal = last index + 1
        System.out.println(sentence.lastIndexOf(" "));
        System.out.println(sentence.length() -1) ; //last index number

    }
}
