import java.util.*;

public class Two_Sum {
    public static int[] two_sum(int nums[], int target) {
        Map<Integer, Integer> res_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (res_map.containsKey(needed)) {
                return new int[] { res_map.get(needed), i };
            }
            res_map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int target = 18;
        int res[] = two_sum(nums, target);
        System.out.println("Two Sum IDX: " + Arrays.toString(res));
    }
}