package day31_Map;

import MyUtil.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class c1_Map {
    //Data Structure :
    //    Array (fixed, primitives & objects)
    //    Collection (dynamic, only objects)
    //    Map (dynamic, only objects)
    //
    //Map Interface: accepts key and value. cannot be primitives.
    //                key MUST be unique
    //Map methods:
    //    put(key, value): inserts key and value to map
    //    get(key): returns the value of the given key
    //    remove(key): removes the given key and it's value from the map
    //    size():
    //    containsKey(key): checks if the key is contained in the map. boolean
    //    containsValue(Value): checks if the value is contained in the map. boolean
    //    clear(): clears everything
    //    isEmpty(): boolean
    //    keySet(): returns all the keys from the map as Set
    //    values(): returns all the values from the map as Collection
    //    setEntry():

    // HashMap: does not keep the insertion order
    //         accepts null
    // HashTable: is synchronized, thread-safe ==> one thread at a time
    //             slower
    //             does not accept null
    // LinkedHashMap: keeps the insertion order as it's.
    //             put & remove are faster
    //             accepts null
    // TreeMap: sorts the keys in ascending (sorted map)
    //         does not accept null

    public static void main(String[] args) {


        Map<String,Integer> studentInfo=new LinkedHashMap<>();
        //key :will be String that we will use for student names
        //key has to be unique

        //value : will be Integer and we will use for student numbers
        //only accepts object types

        //    put(key, value): inserts key and value to map
        studentInfo.put("Sercan",125);
        studentInfo.put("Triska" ,125);


        System.out.println(studentInfo);

        System.out.println("studentInfo.size() = " + studentInfo.size());//2

        //    get(key): returns the value of the given key
        System.out.println("studentInfo.get(\"Sercan\") = " + studentInfo.get("Sercan"));//125

        //    remove(key): removes the given key and it's value from the map
        studentInfo.remove("Sercan");
        System.out.println(studentInfo);

        util.stars();

        //if you want to use map you will need to have 2 parameters
        //first one will be key and has to be unnique
        //second one will be value and this can be dublicate

        //LinkedHashMap<String , double> // map only accept objects not primitives
        LinkedHashMap<String , Double> studentAges=new LinkedHashMap<>();
        //add new members
        studentAges.put("Ozge", 25.5);
        studentAges.put("Musab",35.5);
        studentAges.put("bahast",11.2);
        studentAges.put("Esther",22.2);
        studentAges.put("Esther",18.0);
        studentAges.put("Ozer",18.0);

        System.out.println(studentAges);
        System.out.println("studentAges.get(\"Musab\") = " + studentAges.get("Musab"));
        System.out.println("studentAges.get(11.2) = " + studentAges.get(11.2));//null
        //get method will only accept key
        //and if key is present in your map you will see the value of the key
        //if key is not presnet in your map result will be null


        //    containsKey(key): checks if the key is contained in the map. boolean
        //    containsValue(Value): checks if the value is contained in the map. boolean

        boolean b1=studentAges.containsKey("bah");//fasle
        boolean b2=studentAges.containsKey("Bahast"); //false
        boolean b3=studentAges.containsKey("bahast"); //true
        boolean b4=studentAges.containsValue(18.0); //true
        boolean b5=studentAges.containsValue("Ozge"); //false

        System.out.println("B1" + b1 + " B2 " + b2 + " B3 "+b3);
        System.out.println(b4 + "/" + b5);


        //    clear(): clears everything
        //    isEmpty(): boolean

        System.out.println("studentAges = " + studentAges);
        System.out.println("studentAges.isEmpty() = " + studentAges.isEmpty());
        studentAges.clear();
        System.out.println("studentAges = " + studentAges);//{}
        System.out.println("studentAges.isEmpty() = " + studentAges.isEmpty());//true

    }
}
