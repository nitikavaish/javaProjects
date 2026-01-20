package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class WayToLongWords {
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
            String s = sc.next();
            int n=s.length();
            String ans="";
            if(n>10){
                int rl=n-2;
                 ans=""+s.charAt(0)+rl+s.charAt(n-1);
            }else{
                ans=s;
            }
            System.out.println(ans);
        }
    }
}
