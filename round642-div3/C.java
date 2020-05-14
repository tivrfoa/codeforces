import java.util.*;

public class C {
    
    public static void solve() {
        int n = sc.nextInt();
		int center = n/2;

		long moves = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == center) {
					moves += Math.abs(center-j);
				} else if (j == center) {
					moves += Math.abs(center-i);
				} else {
					moves += Math.abs(i-center) +
						Math.abs(Math.abs(j-1) - center);
				}
			}
		}

		System.out.println(moves);
    }

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

