import java.util.*;

public class D {
    
    public static void solve() {
        int n = sc.nextInt();

		int[] a = new int[n+1];
		// int[] zeros = maxOnlyZeros(a);
	    // System.out.printf("[%d, %d]\n", zeros[0], zeros[1]);
		//


		boolean left = false;
		int idx = n/2;
		if (n%2 == 0) {
			left = true;
		} else {
			++idx;
		}
		int v = 1;
		a[idx] = v++;
		for (int i = n-1; i > 0; --i) {
			
		}
    }

	public static int[] maxOnlyZeros(int[] a) {
		int max = 0;
		int max_i = 0;
		int curr_i = -1;
		int curr_sum = 0;
		int x = 0, y = 0;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] == 0) {
				if (curr_i == -1) {
					curr_i = i;
				}
				++curr_sum;
			} else {
				if (curr_sum > max) {
					max = curr_sum;
					max_i = curr_i;
				}
				curr_i = -1;
				curr_sum = 0;
			}
		}
		if (curr_sum > max) {
			max = curr_sum;
			max_i = curr_i;
		}

		return new int[]{max_i, max_i + max - 1};
	}

    private static Scanner sc;

    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; ++t)
            solve();
    }

}

