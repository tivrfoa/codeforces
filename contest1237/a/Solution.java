import java.util.*;

public class Solution {
    
    public static void solve() {
        int n = sc.nextInt();

        boolean ceil_odd = true; 
        boolean ceil_even = true; 
        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            if (a % 2 == 0) System.out.println(a/2);
            else if (a < 0) {
                if (ceil_odd) {
                    System.out.println(a/2 - 1);
                } else {
                    System.out.println(a/2);
                }
                ceil_odd = !ceil_odd;
            } else {
                if (ceil_even) {
                    System.out.println(a/2 + 1);
                } else {
                    System.out.println(a/2);
                }
                ceil_even = !ceil_even;
            }
        }
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        /*int T = sc.nextInt();

        for (int t = 0; t < T; ++t)*/
            solve();
    }

}

