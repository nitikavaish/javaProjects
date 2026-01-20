package codeforces;

import java.io.*;

import java.util.*;


public class OutOfMemoryError {
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


    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }

            int[] help = arr.clone();

            for (int i = 1; i <= m; i++) {
                int b = sc.nextInt() - 1;
                int c = sc.nextInt();
                arr[b] += c;
                int reset = 0;
                if (arr[b] > h) {
                    reset++;
                }else{
                    reset=0;
                }

            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
