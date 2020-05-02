import java.util.*;

public class Solution {

    private static int[] enter_ids;
    private static int[] exit_ids;
    
    public static void solve() {
        int n = sc.nextInt();
        enter_ids = new int[n];
        exit_ids = new int[n];
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            enter_ids[sc.nextInt() - 1] = i;
        }
        for (int i = 0; i < n; ++i) {
            int id = sc.nextInt() - 1;
            exit_ids[id] = i;

            if (enter_ids[id] != exit_ids[id+ans]) ++ans;
        }

        System.out.println(ans);
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        /*int T = sc.nextInt();

        for (int t = 0; t < T; ++t)*/
            solve();
    }

}

