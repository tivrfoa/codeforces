import java.util.*;

public class Solution {

    private static int[] aa = new int[5001];
    
    public static void solve() {
        int n = sc.nextInt();
        Arrays.fill(aa, 0, n+1, -1);
        
        boolean ok = false;
        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            if (aa[a] != -1) {
                if (i - aa[a] > 1) ok = true;
            } else {
                aa[a] = i;
            }
        }

        if (ok)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

