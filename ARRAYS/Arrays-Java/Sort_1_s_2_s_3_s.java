import java.util.Arrays;

public class Sort_1_s_2_s_3_s {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 2, 1, 2, 0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            // 1
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            // 2
            else if (arr[mid] == 1) {
                mid++;
            }
            // 3
            else {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
