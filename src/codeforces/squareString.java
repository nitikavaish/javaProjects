package codeforces;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class squareString {
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

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                int n = s.length();
                boolean flag = false;
                for (int i = 1; i <= n / 2; i++) {
                    String part = s.substring(0, i);
                    if (s.replace(part, "").isEmpty()) {
                        int cnt = n / i;
                        if (cnt == n) {
                            flag = true;
                        } else if (cnt > 2) {
                            flag = false;
                        } else {
                            flag = true;
                        }

                        break;
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }

    }
}
