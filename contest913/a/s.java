import java.util.*;

class Solution {
    
    public static void main(String args[]) {
        var n = Integer.parseInt(args[0]);
        var m = Integer.parseInt(args[1]);

        System.out.println(solve(n, m));
    }

    public static int solve(int n, int m) {
        if (n > 30) n = 30;
        return m % (1 << n);
    }

    public static int test(int n, int m) {
        
        for (int i = 1; i < 32; ++i) {
            System.out.println(m%i);
        }

        return -1;
    }
}

