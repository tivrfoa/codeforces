import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * The solution didn't work initially because a
 * vertice can have multiple parents
 */
public class Solution1 {

    private static int[] parent;
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

        parent = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; ++i) {
            dp[i] = (sc.nextInt() == 1) ? 1 : -1;
        }

        for (int i = 0; i < n - 1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if (a < b) parent[b] = a;
            else parent[a] = b;
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) if (parent[j] == i) {
                dp[i] = max(dp[i], dp[j] + dp[i]);
            }
        }

        // for (int i : dp) System.out.println(i);

        // Now root already has it's answer
        // So from root plus 1, the answer will be max self
        // or parent + self
        System.out.print(dp[0]);
        for (int i = 1; i < n; ++i) {
            // if dp[i] >= 1, then for sure parent took it
            if (dp[i] >= 1) {
                dp[i] = max(dp[i], dp[parent[i]]);
            } else {
                dp[i] = max(dp[i], dp[parent[i]] + dp[i]);
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

