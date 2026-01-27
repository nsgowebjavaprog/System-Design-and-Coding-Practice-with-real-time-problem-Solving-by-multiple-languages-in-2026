public class I_st_3_rd_Equals_2nd {
    public static int equlas_to_2nd(int[] arr) {

        if (arr.length < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3, 4, 1, 3, 2 };
        System.out.println(equlas_to_2nd(arr));
    }
}