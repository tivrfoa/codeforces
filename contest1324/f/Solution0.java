import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution0 {

    private static boolean[][] graph;
    private static int[] colors;
    private static int[] dp;

    /**
     *
     * What is the subproblem to compute first?
     *
     * dp[p] best of parent
     *
     * Each time I must decide to stop or go to the
     * child vertice.
     *
     */
    public static void solve() {
        int n = sc.nextInt();

        colors = new int[n];
        graph = new boolean[n][n];
        dp = new int[n];

        for (int i = 0; i < n; ++i) {
            colors[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = true;
            graph[b][a] = true;
        }


        for (int i = n - 1; i >= 0; --i) {
            dp[i] = (colors[i] == 1) ? 1 : -1;
            for (int j = i + 1; j < n; ++j) if (graph[i][j]) {
                dp[i] = max(dp[i], dp[j] + dp[i]);
            }
        }

        for (int i : dp) System.out.println(i);

        // Now root already has it's answer
        // So from root plus 1, the answer will be max self
        // or parent + self
        System.out.print(dp[0]);
        for (int i = 1; i < n; ++i) {
            // if color i white, then for sure parent took it
            if (dp[i] >= 1) {
                dp[i] = max(dp[i], dp[i-1]);
            } else {
                dp[i] = max(dp[i], dp[i-1] + dp[i]);
            }
            System.out.print(" " + dp[i]);
        }
        System.out.println();
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        /*int T = sc.nextInt();

        for (int t = 0; t < T; ++t)*/
            solve();
    }

}

