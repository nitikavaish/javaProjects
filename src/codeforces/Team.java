package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Team {
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
        int cnt = 0;
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x + y >= 2) {
                cnt++;
            } else if (x + z >= 2) {
                cnt++;
            } else if (y + z >= 2) {
                cnt++;
            } else {

            }

        }
        System.out.println(cnt);
    }
}
