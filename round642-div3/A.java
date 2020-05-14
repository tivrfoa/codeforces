import java.util.*;

public class A {
    
    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

		if (n == 1) {
			System.out.println(0);
			return;
		}

		if (n == 2) {
			System.out.println(m);
			return;
		}

		if (n >= 3) {
			System.out.println(m * 2);
			return;
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

