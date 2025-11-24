package Searching;

import java.util.Scanner;

public class binarySearch {
    public static int searchKey(int[] number, int key) {
        int start = 0;
        int end = number.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (key == number[mid]) {
                return mid;
            }

            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 18, 24};
        System.out.println(" Enter key element : ");
        int key = sc.nextInt();
        int i = searchKey(number, key);
        System.out.println(" index for " + key + " element is : " + i);
    }

}
