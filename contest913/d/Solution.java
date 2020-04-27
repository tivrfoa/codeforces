import java.util.*;


/**
 *
 * T - milliseconds the exam will last
 * n - problems
 * ti - time each problem takes
 * ai - maximum # problems you have to solve to one 1 point
 *      in problem i
 *
 * Answer: must find maximum possible score and also
 *         output the indexes of the problems solved.
 *
 */
public class Solution {

    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();

        int[] a = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }

        int[] res = new int[n];
        int low = 0, high = n;
        while (low < high) {
            int mid = (low + high + 1) >> 1;
            int[][]
        }
    }
}

