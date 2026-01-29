package Map;

import java.util.*;

public class HashMap_Basics {

    public static void HashMapMethod() {
        // syntax
        Map<String, Integer> mp = new HashMap<>();

        // adding elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishikesh", 19);
        mp.put("Harry", 18);
        System.out.println(mp);

        // getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));//16
        System.out.println(mp.get("Rahul"));// null

        // changing or updating the value of key
        mp.put("Akash", 25);
        System.out.println(mp); //akash=25

        // removing from HashMap
        int val = mp.remove("Akash"); // 25
        System.out.println("val=" + val); //25
        mp.remove("Riya"); // null

        // checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash"));// True

        // checking if a key is in the HashMap
        System.out.println(mp.containsValue(25)); //false
        System.out.println(mp.containsValue(16)); // true

        // Adding new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yash", 30); // no add
        mp.putIfAbsent("Yashika", 30); // add
        System.out.println(mp);

        //Get all keys in HashMap
        System.out.println("keyset : " + mp.keySet());

        // Get all values in HashMap
        System.out.println("values : " + mp.values());

        // Get all entries in HashMap
        System.out.println("entrySet : " + mp.entrySet());

        // Traversing all entries of HashMap-multiple methods
        //method 1
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        // method 2
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        // method 3
        for(var e:mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethod();
    }
}
