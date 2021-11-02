package day31_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class c3_map3 {

    public static void main(String[] args) {
        LinkedHashMap<String , String> gmailCredentials=new LinkedHashMap<>();
        gmailCredentials.put("username1","password1");
        gmailCredentials.put("username2","password2");
        gmailCredentials.put("username3","password3");
        gmailCredentials.put("username4","password4");
        gmailCredentials.put("username5","password4");
        gmailCredentials.put("username6","password4");
        gmailCredentials.put("username1","password4");
        //keys can not be dublicated . It will reassigned the value

        System.out.println("gmailCredentials = " + gmailCredentials);
        //keyset will return all key from map
        for (String eachKey : gmailCredentials.keySet() ){
            System.out.println("eachKey = " + eachKey);
        }
        //values will return all value from map
        for (String eachValue : gmailCredentials.values() ){
            System.out.println("eachValue = " + eachValue);
        }

        //i want to store all usernames in arraylist
        ArrayList<String> usernames=new ArrayList<>(gmailCredentials.keySet());
        ArrayList<String> passwords=new ArrayList<>(gmailCredentials.values());

        System.out.println("usernames = " + usernames);
        System.out.println("passwords = " + passwords);

    }
}
