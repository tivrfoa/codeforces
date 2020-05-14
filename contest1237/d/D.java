import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class D {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			int[] ans = new int[n];

			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; ++i) {
				a[i] = in.nextInt();
				if (a[i] < min) min = a[i];
				if (a[i] > max) max = a[i];
			}

			double T = max/2.0;

			if (min >= T) {
				for (int i = 0; i < n-1; ++i)
					System.out.print("-1 ");
				System.out.println("-1");
				return;
			}

			outer:
			for (int i = 0; i < n; ++i) {
				max = a[i];
				int qt = 1;
				int j = i + 1;
				int minIdx = -1;
				if (a[i] < T) minIdx = i;
				for (; ; ++j) {
					if (j == n) j = 0;
					if (i == j) {
						// System.out.println(i + " minIdx = " + minIdx);
						if (minIdx == j) {
							ans[i] = qt;
						} else if (minIdx > j) {
							ans[i] = qt + (minIdx - j);
						} else {
							ans[i] = qt + (n - j) + minIdx; 
						}
						continue outer;
					}
					if (minIdx == -1 && a[j] < T) {
						minIdx = j;
					}
					double threshold = max/2.0;
					if (a[j] >= threshold) {
						++qt;
						if (a[j] > max) max = a[j];
					} else {
						ans[i] = qt;
						continue outer;
					}
				}
			}

			for (int i = 0; i < n-1; ++i) System.out.print(ans[i] + " ");
			System.out.println(ans[n-1]);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


