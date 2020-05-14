import java.util.*;

public class B {

	private static void swap(int[] a, int[] b, int ai, int bj) {
		int tmp = a[ai];
		a[ai] = b[bj];
		b[bj] = tmp;
	}
    
    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
		for (int i = 0; i < n; ++i) b[i] = sc.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0, j = n - 1; i < k; ++i, --j) {
			if (a[i] >= b[j]) break;
			swap(a, b, i, j);
		}

		int sum = 0;
		for (int i : a) sum += i;

		System.out.println(sum);
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

