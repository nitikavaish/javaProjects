package Map.questions;

import java.util.*;

public class findMostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 1};
        Map<Integer, Integer> fm = new HashMap<>();
        for (int key : arr) {
            if (!fm.containsKey(key)) {
                fm.put(key, 1);
            } else {
                int val = fm.get(key) + 1;
                fm.put(key, val);
            }
        }
//        System.out.println(fm);
        // arr does not exist -ve elements
        int mx_freq = -1;
        int ansKey = -1;
        // method 1
//        for(var e:fm.entrySet()){
//            if(e.getValue()> mx_freq){
//                mx_freq =e.getValue();
//                ansKey=e.getKey();
//            }
//        }
        // method 2
        for (var key : fm.keySet()) {
            if (mx_freq < fm.get(key)) {
                mx_freq = fm.get(key);
                ansKey = key;
            }
        }
        System.out.println("\nmax frequent element is : " + ansKey + " and its frequency is : " + mx_freq);


    }
}
