import java.util.*;

class b {
    
    public static void main(String args[]) {
        System.out.println(isSpruce(4, new int[]{1,1,1}));

        System.out.println(isSpruce(7, new int[]{1,1,1,2,2,2}));

        System.out.println(isSpruce(8, new int[]{1,1,1,1,3,3,3}));
    }

    public static boolean isSpruce(int n, int[] tree) {
        boolean ans = true;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 1; i <= n - 1; ++i) {
            int tmp = tree[i-1] - 1;
            List<Integer> list = map.get(Integer.valueOf(tmp));
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(tmp, list);
        }

        loop:
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.get(Integer.valueOf(i));
            if (list != null) {
                int count = list.size();
                for (Integer c : list) {
                    if (map.containsKey(c)) {
                        --count;
                    }
                }
                if (count < 3) {
                    ans = false;
                    break loop;
                }
            }
        }

        return ans;
    }
}

