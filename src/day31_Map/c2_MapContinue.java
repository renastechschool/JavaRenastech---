package day31_Map;

import java.util.LinkedHashMap;

public class c2_MapContinue {

    public static void main(String[] args) {
        // //we will create a map that will has student name and examscore
        //        //key == student name    String
        //        //value == score           Integer
        //we want to keep insertion order
        LinkedHashMap<String , Integer> studentsScore=new LinkedHashMap<>();

        studentsScore.put("Firas", 87); // B
        studentsScore.put("derya", 81); // B
        studentsScore.put("bawer", 75); //C
        studentsScore.put("ridvan", 65); //C
        studentsScore.put("recep",92); // A
        studentsScore.put("yad",100); // A
        studentsScore.put("esra",95); // A

        //scores more then 90 will be as Score : A
        //scores between 80-90 will be Score : B
        //scores less then 80 will be : C

        LinkedHashMap<String,Integer> scoreA=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> scoreB=new LinkedHashMap<>();
        System.out.println("scoreA = " + scoreA);// {}
        System.out.println("scoreB = " + scoreB);// {}

        ////    //    keySet(): returns all the keys from the map as Set
        //        //keyset will return the keys from the map
        for (String eachStudent : studentsScore.keySet()){
            int eachStudentScore= studentsScore.get(eachStudent);
            //use get method to ask for key and return their values

            if (eachStudentScore >= 90){
                scoreA.put(eachStudent,eachStudentScore);
            }else if (eachStudentScore >= 80 && eachStudentScore <90){
                scoreB.put(eachStudent,eachStudentScore);
            }


        }


        System.out.println("scoreA = " + scoreA);
        System.out.println("scoreB = " + scoreB);
    }
}
