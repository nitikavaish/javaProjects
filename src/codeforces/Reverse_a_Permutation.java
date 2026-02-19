package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reverse_a_Permutation {
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    static StringBuilder out = new StringBuilder();

    public static int[] reverse(int[] arr, int l, int r) {
        int[] copy = arr.clone();

        while (l < r) {
            int temp = copy[l];
            copy[l] = copy[r];
            copy[r] = temp;
            l++;
            r--;

        }
        return copy;
    }

    public static int[] compare(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) return arr1;
            if (arr1[i] < arr2[i]) return arr2;
        }
        return arr1;
    }

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIdx = i;
                }
            }

            int[] best = arr.clone();
            for (int i = 0; i <= maxIdx; i++) {
                int[] candidate = reverse(arr, i, maxIdx);
                best = compare(best, candidate);
            }

            for (int i = 0; i < best.length; i++) {
                out.append(best[i] + " ");
            }
            out.append("\n");

        }

        System.out.println(out.toString());
    }

}

