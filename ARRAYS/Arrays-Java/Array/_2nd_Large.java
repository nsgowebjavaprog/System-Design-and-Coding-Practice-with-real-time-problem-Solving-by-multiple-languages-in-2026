public class _2nd_Large {
    public static int _2nd_LargeFunction(int arr[]) {
        int large = arr[0];
        int sec_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                sec_large = large;
                large = arr[i];
            } else if (i > sec_large && i != large) {
                sec_large = i;
            }
        }
        return sec_large;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 9, 8, 7 };
        System.out.println(_2nd_LargeFunction(arr));
    }
}
