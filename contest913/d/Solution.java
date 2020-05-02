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

        // int[][][] ds = new int[n+1][n][2];
        HashMap<Integer, ArrayList<int[]>> ds = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int k = sc.nextInt();
            ArrayList<int[]> al = ds.get(k);
            if (al == null) {
                al = new ArrayList<>();
                ds.put(k, al);
            }
            al.add(new int[]{sc.nextInt(), i});
        }

        ArrayList<int[]> set = new ArrayList<>();
        int sum = 0;
        boolean ok = false;
        for (int k = n; k > 0; --k) {
            ArrayList<int[]> al = ds.get(k);
            if (al != null) {
                for (int[] p : al) {
                    set.add(p);
                    sum += p[0];
                }
            }
            while (set.size() > k) {
                Collections.sort(set, (a1, a2) -> Integer.compare(a1[0], a2[0]));
                sum -= set.remove(set.size()-1)[0];
            }
            if (set.size() == k && sum <= T) {
                ok = true;
                break;
            }
        }

        if (ok) {
            int sz = set.size();
            System.out.println(sz + "\n" + sz);
            int i = 0;
            for (int[] p : set) {
                if (i++ > 0) System.out.print(" ");
                System.out.print(p[1] + 1);
            }
            System.out.println();
        } else {
            System.out.println("0\n0");
        }

        // test(null);
    }

    public static boolean solve() {
        return false;
    }

    public static void test(String args[]) {
    }
}

