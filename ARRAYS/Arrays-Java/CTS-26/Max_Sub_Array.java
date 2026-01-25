public class Max_Sub_Array {
    public static int max_sum_arrrr(int[] arr) {
        int max = arr[0];
        int curr_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            max = Math.max(curr_sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, -7, 3, 4 };
        System.out.println(max_sum_arrrr(arr));
    }
}
