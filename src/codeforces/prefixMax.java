package codeforces;

import java.util.*;
import codeforces.FastInput.*;
public class prefixMax {
    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int maxEle = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (maxEle < arr[i]) {
                    maxEle = arr[i];
                    idx = i;
                }
            }
            int maxSum=0;
            int temp = arr[0];
            arr[0] = arr[idx];
            arr[idx] = temp;
            for(int i=0;i<n;i++){
                int max= Integer.MIN_VALUE;
                for(int j=0;j<=i;j++){
                    if(max<arr[j]){
                        max=arr[j];
                    }
                }
                maxSum+=max;
            }
            System.out.println(maxSum);
        }
    }

}
