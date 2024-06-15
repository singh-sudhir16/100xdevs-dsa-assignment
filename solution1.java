import java.util.*;

public class Main {

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (m.containsKey(remainder)) {
                if (i - m.get(remainder) >= 2)
                    return true;
            } else {
                m.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] vec = new int[n];
            for (int i = 0; i < n; i++)
                vec[i] = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(checkSubarraySum(vec, k));
        }
        scanner.close();
    }
}
