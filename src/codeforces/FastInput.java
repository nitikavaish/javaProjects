package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastInput {
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = System.in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do c = read(); while (c <= ' ');
            if (c == '-') {
                sign = -1;
                c = read();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int t = fs.nextInt();

        while (t-- > 0) {
            int a = fs.nextInt();
            int b = fs.nextInt();

            out.append(a + b).append('\n');
        }

        System.out.print(out.toString());
    }


}

