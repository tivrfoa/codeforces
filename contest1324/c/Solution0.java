import java.util.*;

public class Solution0 {

    private static boolean ok(int d, String s) {
        int idx = d - 1;
        int done = s.length();
        while (idx > 0 && idx <= done) {
            if (idx == done) return true;
            if (s.charAt(idx) == 'R') {
                idx += d;
            } else {
                // idx -= d;
                --idx;
            }
        }

        return false;
    }

    public static void solve() {
        String s = sc.next();
        int lastR = s.lastIndexOf("R");
        if (lastR == -1) {
            System.out.println(s.length() + 1);
            return;
        }

        int len = s.length();
        int ridx = 0;
        for (int i = len-1; i >= 0; --i) {
            if (s.charAt(i) == 'R') {
                ridx = i;
                int d = len - i;
                if (ok(d, s)) {
                    System.out.println(d);
                    return;
                }
            }
        }
        System.out.println(ridx+1);
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

