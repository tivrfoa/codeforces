import java.util.*;

import static java.lang.Math.max;

public class Solution {

    public static void solve() {
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        for (int i = 0; i < n; ++i) b[i] = sc.nextInt();

        int goodPairs = 0;
        for (int f = 0; f < n; ++f) {
            int ts = a[f];
            int ss = b[f];
            for (int s = f+1; s < n; ++s) {
                if (ts + a[s] > ss + b[s]) ++goodPairs;
            }
        }

        System.out.println(goodPairs);
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        /*int T = sc.nextInt();

        for (int t = 0; t < T; ++t)*/
            solve();
    }

}

