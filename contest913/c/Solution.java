import java.util.*;

public class Solution {

    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        // test(null);
    }

    public static boolean solve() {

    }

    public static void test(String args[]) {
        System.out.println(isSpruce(4, new int[]{0,0,0}));

        System.out.println(isSpruce(7, new int[]{0,0,0,1,1,1}));

        System.out.println(isSpruce(8, new int[]{0,0,0,0,2,2,2}));
    }
}

