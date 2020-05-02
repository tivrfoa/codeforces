import java.util.*;

import static java.lang.Math.max;

public class Solution {

    private static int getMaxDistanceBetweenR(
            int first, int last, String s) {
        int diff = 0;
        for (int i = last - 1; i >= first; --i) {
            if (s.charAt(i) == 'R') {
                diff = max(diff, last-i);
                last = i;
            }
        }

        return diff;
    }

    public static void solve() {
        String s = sc.next();
        int firstR = s.indexOf("R");
        int lastR = s.lastIndexOf("R");
        if (firstR == -1) {
            System.out.println(s.length() + 1);
            return;
        }

        int len = s.length();
        int max1 = max(firstR+1, len-lastR);
        if (firstR == lastR) {
            System.out.println(max1);
            return;
        }

        System.out.println(max(getMaxDistanceBetweenR(firstR, lastR, s),
                               max1));
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

