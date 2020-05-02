import java.util.*;

public class Solution {
    
    public static void solve() {
        int n = sc.nextInt();

        boolean odd = false, even = false;

        while(n-- > 0) {
            int a = sc.nextInt();
            if (a % 2 == 0) even = true;
            else odd = true;
        }

        if (even && odd) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

