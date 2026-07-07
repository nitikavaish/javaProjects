package Dynamic_Programming.Memoization_And_Tabulation;

import java.util.*;

public class FriendsPairing {
    /*
    public static int pairing(int n, int dp[]) {
        if (n <= 2) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = pairing(n - 1, dp) + (n - 1) * pairing(n - 2, dp);
    }

    public static int pair(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return pairing(n, dp);
    }

     */
    public static int pair(int n) {
        if (n <= 2) return n;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pair(n));


    }
}
