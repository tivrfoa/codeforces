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
public class Solution1 {

    private static Scanner sc;

    public static class P implements Comparable<P> {
        int t, i;
        public P(int t, int i) {
            this.t = t; this.i = i;
        }

        @Override
        public int compareTo(P other) {
            if (t < other.t) return -1;
            if (t > other.t) return 1;
            if (i < other.i) return -1;
            return 1;
        }

        @Override
        public boolean equals(Object o) {
            return i == ((P)o).i;
        }
    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();

        // int[][][] ds = new int[n+1][n][2];
        HashMap<Integer, ArrayList<P>> ds = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int k = sc.nextInt();
            ArrayList<P> al = ds.get(k);
            if (al == null) {
                al = new ArrayList<P>();
                ds.put(k, al);
            }
            al.add(new P(sc.nextInt(), i));
        }

        TreeSet<P> set = new TreeSet<>();
        int sum = 0;
        boolean ok = false;
        for (int k = n; k > 0; --k) {
            ArrayList<P> al = ds.get(k);
            if (al != null) {
                for (P p : al) {
                    set.add(p);
                    sum += p.t;
                }
            }
            while (set.size() > k) {
                sum -= set.pollLast().t;
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
            for (P p : set) {
                if (i++ > 0) System.out.print(" ");
                System.out.print(p.i + 1);
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

