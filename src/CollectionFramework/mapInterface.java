package CollectionFramework;

import java.util.*;

public class mapInterface {
    public static void HashMap() {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Riya ");
        mp.put(1, "Aman");
        mp.put(2, "Rohan");

        System.out.println(mp); //{1=Aman, 2=Rohan, 3=Riya }
//        System.out.println(mp.get(2)); // Rohan
//        System.out.println(mp.containsKey(4)); // false
//        System.out.println(mp.containsValue("Rohan")); // true
//
//        mp.put(1, "Amar");  //over-rides
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya }
//        mp.putIfAbsent(4, "Rohan"); // if key not preset than assign Rohan to key 4
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya , 4=Rohan}
//        System.out.println(mp.get(4));//Rohan
//        System.out.println(mp.containsValue("Rohan"));// true
//        mp.putIfAbsent(3, "Riya");
//        System.out.println(mp);
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());

        // iterating over map

//        for (String i : mp.values()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (Integer i : mp.keySet()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (var i : mp.keySet()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
//        for (var i : mp.values()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
        //iterate over the key, value mapping
//        for (var e : mp.entrySet()) {
//           System.out.println(e.getKey() + " : " + e.getValue());
//          System.out.println(e);
//            System.out.println(e.getKey());
//           System.out.println(e.getValue());
//        }


    }

    public static void LinkedHashMap() {
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(3, "Riya ");
        mp.put(1, "Aman");
        mp.put(2, "Rohan");

//        System.out.println(mp); //{1=Aman, 2=Rohan, 3=Riya }
//        System.out.println(mp.get(2)); // Rohan
//        System.out.println(mp.containsKey(4)); // false
//        System.out.println(mp.containsValue("Rohan")); // true
//
//        mp.put(1, "Amar");  //over-rides
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya }
//        mp.putIfAbsent(4, "Rohan"); // if key not preset than assign Rohan to key 4
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya , 4=Rohan}
//        System.out.println(mp.get(4));//Rohan
//        System.out.println(mp.containsValue("Rohan"));// true
//        mp.putIfAbsent(3, "Riya");
//        System.out.println(mp);
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());

        // iterating over map

//        for (String i : mp.values()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (Integer i : mp.keySet()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (var i : mp.keySet()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
//        for (var i : mp.values()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
        //iterate over the key, value mapping
//        for (var e : mp.entrySet()) {
//           System.out.println(e.getKey() + " : " + e.getValue());
//          System.out.println(e);
//            System.out.println(e.getKey());
//          System.out.println(e.getValue());
//        }
        System.out.println(mp);

    }
    public static void TreeSet() {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Riya ");
        mp.put(1, "Aman");
        mp.put(2, "Rohan");

//        System.out.println(mp); //{1=Aman, 2=Rohan, 3=Riya }
//        System.out.println(mp.get(2)); // Rohan
//        System.out.println(mp.containsKey(4)); // false
//        System.out.println(mp.containsValue("Rohan")); // true
//
//        mp.put(1, "Amar");  //over-rides
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya }
//        mp.putIfAbsent(4, "Rohan"); // if key not preset than assign Rohan to key 4
//        System.out.println(mp);//{1=Amar, 2=Rohan, 3=Riya , 4=Rohan}
//        System.out.println(mp.get(4));//Rohan
//        System.out.println(mp.containsValue("Rohan"));// true
//        mp.putIfAbsent(3, "Riya");
//        System.out.println(mp);
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());

        // iterating over map

//        for (String i : mp.values()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (Integer i : mp.keySet()) {
//            System.out.nthLevel(i+" ");
//        }
//        System.out.println();
//        for (var i : mp.keySet()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
//        for (var i : mp.values()) {
//            System.out.nthLevel(i + " ");
//        }
//        System.out.println();
        //iterate over the key, value mapping
//        for (var e : mp.entrySet()) {
//           System.out.println(e.getKey() + " : " + e.getValue());
//          System.out.println(e);
//            System.out.println(e.getKey());
//          System.out.println(e.getValue());
//        }
        System.out.println(mp);

    }

    public static void main(String[] args) {
//       HashMap();
//        LinkedHashMap();
        TreeSet();
    }
}
