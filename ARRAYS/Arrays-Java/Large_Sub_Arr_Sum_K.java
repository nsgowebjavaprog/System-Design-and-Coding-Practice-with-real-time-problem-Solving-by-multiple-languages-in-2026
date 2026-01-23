public class Large_Sub_Arr_Sum_K {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 1, 3, 2 };
        int k = 5;

        int left = 0;
        int sum = 0;
        int max_len = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                max_len = Math.max(max_len, right - left + 1);
            }
        }
        System.out.println(max_len);
    }
}
