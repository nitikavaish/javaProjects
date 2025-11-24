package OopsInJava;

import java.util.*;

public class arraylist {
    public static class arrayList {
        int[] arr = new int[5];
        int idx = 0;
        int size = 0;


        public void add(int ele) {
            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2);
                arr=brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx,int val){
            arr[idx]=val;

        }
    }

    public static void main(String[] args) {
        arrayList arr = new arrayList();
        arr.add(2);
        arr.add(3);
        System.out.println(arr.size);

    }
}
