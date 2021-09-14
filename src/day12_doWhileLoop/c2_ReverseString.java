package day12_doWhileLoop;

public class c2_ReverseString {

    public static void main(String[] args) {
        //
        String actualText="Java is so fun !!!";
        System.out.println(actualText);

        String reverse="";
        int lastIndex=actualText.length() -1 ;//last index of our text which is our first index for reverse string

        do {//20
            //our goal is store each letter from last one to first one
            reverse += actualText.charAt(lastIndex);//20 19

            //iteration
            //from last index to first index
            lastIndex--;//20 19
        }while (lastIndex >=0); // condition which is your end point which is index 0 (first letter)

        System.out.println(reverse);
    }
}

//your class is orange that means you didnt add to git
//if it is green you add it but you didnt commit it
